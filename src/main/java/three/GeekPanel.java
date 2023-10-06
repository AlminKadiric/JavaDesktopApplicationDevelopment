package three;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GeekPanel extends JPanel implements ItemListener  {
    private final CheckBoxPanel checkBoxPanel = new CheckBoxPanel(this);
    private final PicturePanel picturePanel = new PicturePanel("geek-cght.gif");

    public GeekPanel() {
        setLayout(new BorderLayout());
        add(BorderLayout.LINE_START, checkBoxPanel);
        add(BorderLayout.CENTER, picturePanel);
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        ItemSelectable source = e.getItemSelectable();

        char slovo = '-';
        int index = 5;
        if (source==checkBoxPanel.getChinCheckBox()){
      slovo = 'c';
      index=6;

        }else if (source==checkBoxPanel.getGlassesCheckBox()){
            slovo='g';
           index=7;
        }else if (source==checkBoxPanel.getHairCheckBox()){
            slovo='h';
        }else if (source==checkBoxPanel.getTeethCheckBox()){
            slovo='t';
        index=8;
        }
        if (e.getStateChange()==ItemEvent.DESELECTED){
            slovo='-';
        }
        picturePanel.updatePictureName(slovo,index);
    }
}
