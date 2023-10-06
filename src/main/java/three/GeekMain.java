package three;

import Gui.GeekPanel;

import javax.swing.*;
import java.awt.*;

public class GeekMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(GeekMain::createAndShowGui);
    }
    private static void createAndShowGui(){
        JFrame frame = new JFrame();
        frame.setTitle( "Geek Panel with Item Listener");
        JPanel geekPanel = new GeekPanel();
        frame.setContentPane(geekPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500,400));
        frame.setVisible(true);
    }
}
