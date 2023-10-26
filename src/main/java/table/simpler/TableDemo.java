package table.simpler;

import javax.swing.*;


public class TableDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(TableDemo::createGUI);
    }

    static void createGUI() {
        JFrame frame = new JFrame("Table Model");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ComplexTablePanel complexTablePanel = new ComplexTablePanel();
        frame.setContentPane(complexTablePanel);
        frame.pack();
        frame.setVisible(true);

    }
}
