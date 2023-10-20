package newGui.connection;

import newGui.ui.PlayerPanel;
import table.simple.TablePanel;

import javax.swing.*;

public class MainDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainDemo::createAndShowGUI);


    }

    public static void createAndShowGUI(){
        JFrame frame = new JFrame();
        frame.setTitle("Players");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        PlayerPanel playerPanel = new PlayerPanel();
        frame.setContentPane(playerPanel);
        frame.pack();
        frame.setVisible(true);

    }
}
