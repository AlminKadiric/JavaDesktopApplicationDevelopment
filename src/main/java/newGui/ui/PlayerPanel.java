package newGui.ui;

import newGui.connection.Player;
import newGui.connection.PlayerDao;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class PlayerPanel extends JPanel {

    private List<String> columnNames;
    private List<Player> players;
    private final PlayerDao playerDao=new PlayerDao();

    public PlayerPanel() {

        super();
        this.columnNames=playerDao.getColumnNames();
        this.players=playerDao.getAll();

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

       PlayerTableModel playerTableModel =  new PlayerTableModel();

        JTable playerTable = new JTable(playerTableModel);


        TableColumn sportColumn = playerTable.getColumnModel().getColumn(3);
        JComboBox<String>sportComboBox = new JComboBox<>();

        sportColumn.setCellEditor(new DefaultCellEditor(sportComboBox));
         players.stream().map(Player::getSport).distinct().forEach(sportComboBox::addItem);


        JScrollPane playerTableScrollPane = new JScrollPane(playerTable);
        add(playerTableScrollPane);

    }

    private class PlayerTableModel extends AbstractTableModel {


     public PlayerTableModel(){


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
         Player player =    players.get(rowIndex);
         PlayerWrapper playerWrapper = new PlayerWrapper(player);
         playerWrapper.setColumnValue(columnIndex,aValue);

         //playerDao.update(player);

        }

        @Override
        public String getColumnName(int column) {
            return columnNames.get(column);
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            Class<?> clazz = getValueAt(0,columnIndex).getClass();
            return clazz;
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return columnIndex>0;
        }
    }


}
