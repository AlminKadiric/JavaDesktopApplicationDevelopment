package five;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.net.Socket;

public class TablePanel extends JPanel {



    public TablePanel() {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        MyTableModel tableModel = new MyTableModel();



        JTable table = new JTable(tableModel);
        table.setDefaultRenderer(Color.class, new ColorRenderer());
     TableColumn sportColumn = table.getColumnModel().getColumn(2);

      JComboBox <String> sportComboBox =  new JComboBox<>();
              for(Sport sport:Sport.values()){
                  String sportName = sport.getName();
                  sportComboBox.addItem(sportName);
              }
              sportColumn.setCellEditor(new DefaultCellEditor(sportComboBox));
     ColorCellEditor colorCellEditor = new ColorCellEditor();
      table.setDefaultEditor(Color.class,colorCellEditor);
        JScrollPane scrollPane = new JScrollPane(table);
       setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        add(scrollPane);

    }


    private class MyTableModel extends AbstractTableModel {


        private String[] columnNames = {"Name", "Surname", "Sport", " # godina", "Vegeterijanac","Boja"};
        private Object[][] data = {
                {"Mirsad", "Skandro", Sport.SKIJANJE.getName(), 23, true, Color.CYAN},
                {"Alden", "Efendic", Sport.SAH.getName(), 12, false,Color.GREEN},
                {"Dejla", "Saric", Sport.ODBOJKA.getName(), 5, true,Color.BLUE},
                {"Sladjana", "Jokic", Sport.ODBOJKA.getName(), 7, false,Color.MAGENTA},
                {"Alden", "Efendic", Sport.SAH.getName(), 12, false,Color.ORANGE},
                {"Alden", "Efendic", Sport.SAH.getName(), 12, false,Color.RED},
                {"Alden", "Efendic", Sport.SKIJANJE.getName(), 12, false,Color.YELLOW}

        };

        @Override
        public int getRowCount() {
            return data.length;
        }

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return data[rowIndex][columnIndex];
        }

        @Override
        public String getColumnName(int column) {
            return columnNames[column];


        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return true;

        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       data[rowIndex][columnIndex]= aValue;


        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            return getValueAt(0,columnIndex).getClass();

        }
    }
}
