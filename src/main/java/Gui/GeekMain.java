package Gui;

import javax.swing.*;
import java.awt.*;

public class GeekMain {
    public static void main(String[] args) {
        Runnable runnable = GeekMain::createAndShowGui;
        SwingUtilities.invokeLater(runnable);
    }
    static void createAndShowGui(){
        JFrame jFrame = new JFrame("Geek for Geeks");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //jFrame.setSize(400,300);
        jFrame.setMinimumSize(new Dimension(400,300));
        JPanel geekPanel = new GeekPanel();
        geekPanel.setOpaque(true);
        jFrame.setContentPane(geekPanel);
        jFrame.pack();
        jFrame.setVisible(true);



    }
}
