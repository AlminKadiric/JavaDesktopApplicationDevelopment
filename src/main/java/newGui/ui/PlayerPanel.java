package newGui.ui;

import newGui.connection.Player;
import newGui.connection.PlayerDao;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class PlayerPanel extends JPanel {

    private List<String> columnNames;
    private List<Player> players;
    private final PlayerDao playerDao = new PlayerDao();
    private final JTable playerTable;
    private final JTextField searchTextField;
    private final TableRowSorter<PlayerTableModel>tableRowSorter;



    public PlayerPanel() {

        super();
        this.columnNames = playerDao.getColumnNames();
        this.players = playerDao.getAll();

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        PlayerTableModel playerTableModel = new PlayerTableModel();
        this.tableRowSorter=new TableRowSorter<>(playerTableModel);

        PlayerTableListener playerTableListener = new PlayerTableListener();
        playerTableModel.addTableModelListener(playerTableListener);
        playerTable = new JTable(playerTableModel);
        this.playerTable.setRowSorter(tableRowSorter);
        playerTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


        TableColumn sportColumn = playerTable.getColumnModel().getColumn(3);
        JComboBox<String> sportComboBox = new JComboBox<>();

        sportColumn.setCellEditor(new DefaultCellEditor(sportComboBox));
        players.stream().map(Player::getSport).distinct().forEach(sportComboBox::addItem);

        JPanel searchForm =new JPanel(new GridLayout(1,1));
        searchForm.setSize(200,30);
        JLabel labela =new JLabel("Filter by name: ",SwingConstants.TRAILING);
        searchForm.add(labela);
        this.searchTextField=new JTextField();
        SearchTextFieldDocumentListener searchTextFieldDocumentListener= new SearchTextFieldDocumentListener();

        this.searchTextField.getDocument().addDocumentListener(searchTextFieldDocumentListener);
        labela.setLabelFor(searchTextField);
        searchForm.add(searchTextField);
        add(searchForm);


        JScrollPane playerTableScrollPane = new JScrollPane(playerTable);

        add(playerTableScrollPane);





        ButtonGroup buttonGroup = new ButtonGroup();
        RadioButtonActionListener radioButtonActionListener = new RadioButtonActionListener();

        JRadioButton singleSelectOptionRadioButton = new JRadioButton("SINGLE ROW SELECTION");
        singleSelectOptionRadioButton.addActionListener(radioButtonActionListener);
        singleSelectOptionRadioButton.setSelected(true);

        buttonGroup.add(singleSelectOptionRadioButton);
        add(singleSelectOptionRadioButton);

        JRadioButton multipleSelectOptionRadioButton = new JRadioButton("MULTIPLE ROW SELECTION");
       multipleSelectOptionRadioButton.addActionListener(radioButtonActionListener);
        buttonGroup.add(multipleSelectOptionRadioButton);


        add(multipleSelectOptionRadioButton);


    }

    private void filterByName(){
        RowFilter<PlayerTableModel,Object>rowFilter=RowFilter.regexFilter(searchTextField.getText(),1);
        tableRowSorter.setRowFilter(rowFilter);

    }
    private class SearchTextFieldDocumentListener implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            filterByName();

        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            filterByName();

        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            filterByName();

        }
    }
    private class RadioButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String komanda = e.getActionCommand();
            System.out.println(komanda);
            if("MULTIPLE ROW SELECTION".equals(komanda)){
                playerTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            }else{
                playerTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }

        }
    }


    private class PlayerTableListener implements TableModelListener {

        @Override
        public void tableChanged(TableModelEvent event) {
            int rowIndex = event.getFirstRow();
            int columnIndex = event.getColumn();
            PlayerTableModel model = (PlayerTableModel) event.getSource();
            System.out.println("Desila se promjena : " + model.getValueAt(rowIndex, columnIndex));
        }
    }


    private class PlayerTableModel extends AbstractTableModel {


        public PlayerTableModel() {


        }

        @Override
        public int getRowCount() {
            return players.size();
        }

        @Override
        public int getColumnCount() {
            return columnNames.size();
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Player player = players.get(rowIndex);
            PlayerWrapper playerWrapper = new PlayerWrapper(player);
            Object playerFieldOnIndex = playerWrapper.getColumnValue(columnIndex);
            return playerFieldOnIndex;


        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            Player player = players.get(rowIndex);
            System.out.println("Index: " + columnIndex);
            PlayerWrapper playerWrapper = new PlayerWrapper(player);
            playerWrapper.setColumnValue(columnIndex, aValue);
            playerDao.update(player);
            fireTableCellUpdated(rowIndex, columnIndex);


            //playerDao.update(player);

        }

        @Override
        public String getColumnName(int column) {
            return columnNames.get(column);
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            Class<?> clazz = getValueAt(0, columnIndex).getClass();
            return clazz;
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return columnIndex > 0;
        }
    }
}


