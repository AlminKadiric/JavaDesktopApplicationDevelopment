package three;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PicturePanel extends JPanel {
private final JLabel pictureLabel = new JLabel();
private StringBuffer pictureNameBuffer = new StringBuffer();
public PicturePanel(String initialPictureName){
 pictureNameBuffer.append(initialPictureName);
 updatePicture();
 add(pictureLabel);
}

public void updatePicture(){
     String pictureName = pictureNameBuffer.toString();
    ImageIcon imageIcon = new ImageIcon(pictureName);
   pictureLabel.setIcon(imageIcon);
}


    public void updatePictureName(char slovo, int index) {
     pictureNameBuffer.setCharAt(index,slovo);
    updatePicture();
    }
}
