import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;

public class ButtonPanel extends JPanel {
    private JButton leftButton = new JButton("Disable middle button");
    private JButton middleButton = new JButton("Middle button");
    private JButton rightButton = new JButton("Enable middle button");

    public ButtonPanel(){
        leftButton.setHorizontalTextPosition(SwingConstants.LEADING);
        middleButton.setHorizontalTextPosition(SwingConstants.LEADING);
        add(leftButton);
        add(middleButton);
        add(rightButton);
        init();


    }
    private void init(){
        ImageIcon leftIcon = createIcon("C:\\Users\\terde4se\\Desktop\\JavaDesktopApplicationDevelopment\\right.gif");
        leftButton.setEnabled(true);
        leftButton.setIcon(leftIcon);
        middleButton.setEnabled(true);
        rightButton.setEnabled(false);
        leftButton.addActionListener(this::onLeftButton);
        leftButton.setActionCommand("DISABLE");
        leftButton.setMnemonic(KeyEvent.VK_LEFT);
        rightButton.addActionListener(this::onRightButtonClick);
        ImageIcon middleIcon = new ImageIcon("C:\\Users\\terde4se\\Desktop\\JavaDesktopApplicationDevelopment\\middle.gif");
         middleButton.setIcon(middleIcon);
        rightButton.setMnemonic(KeyEvent.VK_RIGHT);
        ImageIcon rightIcon= new ImageIcon("C:\\Users\\terde4se\\Desktop\\JavaDesktopApplicationDevelopment\\left.gif");
        rightButton.setIcon(rightIcon);
    }

    private ImageIcon createIcon(String urlPath){

        return new ImageIcon(urlPath);

     //   Class clazz = ButtonPanel.class;
    // URL imageUrl =clazz.getResource(urlPath);
  /*    if(imageUrl == null){
         System.err.println("Nema jarane na ovom url pathu nista...");
    return null;
     }else{
         return new ImageIcon(imageUrl);
     }*/

    }
    /*private class  LeftButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           leftButton.setEnabled(false);
           middleButton.setEnabled(false);
           rightButton.setEnabled(true);
        }
    }

    /*private class RightButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            leftButton.setEnabled(true);
            middleButton.setEnabled(true);
            rightButton.setEnabled(false);
        }
    }*/

    private void onButtonClick(ActionEvent event){
        String actionCommand = event.getActionCommand();
     if(actionCommand.equalsIgnoreCase("DISABLE")){
         leftButton.setEnabled(false);
         middleButton.setEnabled(false);
         rightButton.setEnabled(true);
     }else{
         leftButton.setEnabled(true);
         middleButton.setEnabled(true);
         rightButton.setEnabled(false);

     }
    }
    private void onLeftButton(ActionEvent e){
        leftButton.setEnabled(false);
        middleButton.setEnabled(false);
        rightButton.setEnabled(true);
    }
    private void onRightButtonClick(ActionEvent e){
        leftButton.setEnabled(true);
        middleButton.setEnabled(true);
        rightButton.setEnabled(false);
    }



}
