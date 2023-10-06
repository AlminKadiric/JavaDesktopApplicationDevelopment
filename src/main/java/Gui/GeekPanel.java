package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GeekPanel extends JPanel {
    private JCheckBox chinCheckBox = new JCheckBox("Chin");
    private JCheckBox glassesCheckBox = new JCheckBox("Glasses");
    private JCheckBox hairCheckBox = new JCheckBox("Hair");
    private JCheckBox teethCheckBox = new JCheckBox("teeth");

    private JLabel pictureLabel = new JLabel();

    public GeekPanel() {
        setLayout(new BorderLayout());
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.setLayout(new GridLayout(0, 1));
        checkBoxPanel.add(chinCheckBox);
        checkBoxPanel.add(glassesCheckBox);
        checkBoxPanel.add(hairCheckBox);
        checkBoxPanel.add(teethCheckBox);
        chinCheckBox.addActionListener(this::onCheckBoxCheckChange);
        glassesCheckBox.addActionListener(this::onCheckBoxCheckChange);
        hairCheckBox.addActionListener(this::onCheckBoxCheckChange);
        teethCheckBox.addActionListener(this::onCheckBoxCheckChange);

        updatePicture("C:\\Users\\terde4se\\Desktop\\JavaDesktopApplicationDevelopment\\geek-----.gif");
        JPanel picturePanel = new JPanel();
        picturePanel.add(pictureLabel);
        picturePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        add(checkBoxPanel, BorderLayout.LINE_START);
        add(picturePanel, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }
    private void  onCheckBoxCheckChange(ActionEvent e){
       // JCheckBox checkBox = (JCheckBox) e.getSource();
       // if(checkBox==chinCheckBox){

      //  }else if(checkBox==glassesCheckBox){

       // }
        char chinChar = chinCheckBox.isSelected() ? 'c' : '-';
        char glassesChar = glassesCheckBox.isSelected() ? 'g' : '-';
        char hairChar = hairCheckBox.isSelected() ? 'h' : '-';
        char teethChar = teethCheckBox.isSelected() ? 't' : '-';
        String pictureName = "geek-" + chinChar + glassesChar + hairChar + teethChar + ".gif";
        updatePicture(pictureName);
    }

    private void updatePicture(String picturName) {
        ImageIcon imageIcon = new ImageIcon(picturName);
        pictureLabel.setIcon(imageIcon);
    }
}
