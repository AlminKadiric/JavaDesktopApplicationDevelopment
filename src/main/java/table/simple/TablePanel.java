package table.simple;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TablePanel extends JPanel {
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
    private final JTable table = new JTable(data, columnNames);

    public TablePanel() {
        setLayout(new GridLayout(1, 0));

        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);


        table.addMouseListener(new CustomTableMouseListener());

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }

    private class CustomTableMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent event) {
            int numberOfRows = table.getRowCount();
            int numberOfColumns = table.getColumnCount();

            TableModel tableModel = table.getModel();
            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfColumns; j++) {
                    System.out.print(tableModel.getValueAt(i,j)+ " - ");

                }
                System.out.println();
            }
        }
    }

}
