package table.simpler;

import javax.swing.table.AbstractTableModel;

public class CustomTableModel  extends AbstractTableModel {
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
}

