package table.simple;

import javax.swing.*;

public class SimpleTableDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleTableDemo::createAndShowGUI);

    }
    private static void createAndShowGUI(){
    JFrame frame = new JFrame();
    frame.setTitle("Simple Table overview");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    TablePanel tablePanel = new TablePanel();
    frame.setContentPane(tablePanel);
    frame.pack();
    frame.setVisible(true);
    }
}
