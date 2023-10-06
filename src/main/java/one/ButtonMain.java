package one;

import javax.swing.*;
import java.awt.*;

public class ButtonMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ButtonMain::createGUI);
    }
    static void createGUI(){
        JFrame frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         frame.setMinimumSize(new Dimension(500,400));
          frame.setContentPane(new ButtonPanel());
           frame.setVisible(true);
    }

}
