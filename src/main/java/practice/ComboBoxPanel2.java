package practice;

import Gui.GeekPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class ComboBoxPanel2 extends JPanel implements ActionListener {

    private  String [] patternList = {
            "dd.MM.yy",
            "MM/dd/yy",
            "yyyy.MM.dd G 'at' hh:mm:ss z",
            "h:mm a",
            "H:mm:ss:SSS"
    };

    private  final  JComboBox<String> patternDateComboBox = new JComboBox<>(patternList);


    private final  JLabel dateLabel = new JLabel();

    public ComboBoxPanel2(){
        setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
      JPanel patternPanel = new JPanel();
      patternPanel.setLayout(new BoxLayout(patternPanel,BoxLayout.PAGE_AXIS));
      patternPanel.add(new JLabel("Enter date pattern"));
      patternPanel.add(new JLabel("Enter date pattern or"));
      patternPanel.add(new JLabel("select one from the list"));
             patternDateComboBox.setAlignmentX(LEFT_ALIGNMENT);
             patternDateComboBox.setEditable(true);

           patternDateComboBox.addActionListener(this);
             patternPanel.add(patternDateComboBox);
        patternPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
       add(patternPanel);


      add(patternDateComboBox);
      add(Box.createRigidArea(new Dimension(0,20)));
      JPanel resultPanel = new JPanel(new GridLayout(0,1));

      resultPanel.add(new JLabel("Current Date/Time"));
      resultPanel.add(dateLabel);


      resultPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

      dateLabel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK),BorderFactory.createEmptyBorder(10,10,10,10)));
      add(resultPanel);
      formatDateAccordingToPattern(patternList[0]);

      setBorder(BorderFactory.createEmptyBorder(20,20,20,20));


    }
    private void formatDateAccordingToPattern(String currentPattern){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(currentPattern);
         String dataAsString = formatter.format(date);
         dateLabel.setText(dataAsString);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String currentPattern = (String) patternDateComboBox.getSelectedItem();

        formatDateAccordingToPattern(currentPattern);

    }
}
