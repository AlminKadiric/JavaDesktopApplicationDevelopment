package practice;

import javax.management.remote.JMXPrincipal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxPanel extends JPanel {

    private String[] petList = {"rabit","bird","cat","pig","dog"};
    private final JComboBox<String> petComboBox;
    private final  JLabel pictureLabel;


    public ComboBoxPanel(){
      super(new BorderLayout());
      this.petComboBox=new JComboBox<>(petList);
      ComboBoxListener comboBoxListener = new ComboBoxListener();
      this.petComboBox.addActionListener(comboBoxListener);
      this.pictureLabel=new JLabel();
      this.pictureLabel.setPreferredSize(new Dimension(500,400));
      add(petComboBox,BorderLayout.PAGE_START);
      add(pictureLabel,BorderLayout.CENTER);
      setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
     this.updatePictureLabel(petList[0]);
    }

    private void updatePictureLabel(String pictureName){
        ImageIcon imageIcon = new ImageIcon(pictureName + ".gif");
        pictureLabel.setIcon(imageIcon);
        pictureLabel.setToolTipText("Omiljena zivotinja je : " + pictureName);
    }

    private class ComboBoxListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
       String petName = (String) comboBox.getSelectedItem();
       updatePictureLabel(petName);

        }
    }
}
