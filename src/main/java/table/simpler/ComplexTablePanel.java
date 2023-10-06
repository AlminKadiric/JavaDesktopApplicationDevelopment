package table.simpler;

import table.simple.TablePanel;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.awt.*;

public class ComplexTablePanel extends JPanel {
  private final JTable complexTable;

  public ComplexTablePanel(){
      TableModel tableModel = new CustomTableModel();
      tableModel.addTableModelListener(new CustomTableListener());
      this.complexTable=new JTable(tableModel);
      this.complexTable.setPreferredScrollableViewportSize(new Dimension(500,80));
     JScrollPane scrollPane = new JScrollPane(complexTable);
  add(scrollPane);
  }
  class CustomTableListener implements TableModelListener{

      @Override
      public void tableChanged(TableModelEvent event) {
         int row=  event.getFirstRow();
         int column= event.getColumn();
          TableModel tableModel = (TableModel) event.getSource();
          String columnName = tableModel.getColumnName(column);
              Object data = tableModel.getValueAt(row,column);
          System.out.println(data);

      }
  }

    class CustomTableModel extends AbstractTableModel {
        private String[] columnNames = {"Name", "Surname", "Sport", " # godina", "Vegeterijanac"};
        private Object[][] data = {
                {"Mirsad", "Skandro", "Skijanje", 23, true},
                {"Alden", "Efendic", "Sah", 12, false},
                {"Dejla", "Saric", "Odbojka", 5, true},
                {"Sladjana", "Jokic", "Kosarka", 7, false},
                {"Alden", "Efendic", "Sah", 12, false},
                {"Alden", "Efendic", "Sah", 12, false},
                {"Alden", "Efendic", "Sah", 12, false}

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
        public Class<?> getColumnClass(int columnIndex) {
       return getValueAt(0,columnIndex).getClass();
        }

        @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            data[rowIndex][columnIndex]=aValue;
            fireTableCellUpdated(rowIndex,columnIndex);
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            if(columnIndex<2){
                return true;
            }else {
                return false;
            }
        }
    }
}
