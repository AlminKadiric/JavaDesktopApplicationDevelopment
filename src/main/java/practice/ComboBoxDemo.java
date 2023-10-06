package practice;

import javax.swing.*;
import java.nio.ShortBuffer;

public class ComboBoxDemo {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(ComboBoxDemo::createAndShowGUI);
    }


    private static void createAndShowGUI(){
     JFrame frame = new JFrame("Frame");
     frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

     ComboBoxPanel2 comboBoxPanel= new ComboBoxPanel2();
     ComboBoxPanel comboBoxPanel1 = new ComboBoxPanel();
     ComboBoxPanel3 comboBoxPanel3 = new ComboBoxPanel3();
     JPanel horizontalPanel = new JPanel();
     horizontalPanel.add(comboBoxPanel);
     horizontalPanel.add(comboBoxPanel1);
     horizontalPanel.add(comboBoxPanel3);
     frame.setContentPane(horizontalPanel);

     frame.pack();
     frame.setVisible(true);
    }
}
