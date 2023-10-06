package practice;

import javax.swing.*;
import java.awt.*;

public class ComboBoxPanel3 extends JPanel {
    private String[] petList = {"rabit", "bird", "cat", "pig", "dog"};
    private final ImageIcon[] petImageIcons = new ImageIcon[petList.length];

    private final JComboBox<Integer> petPictureComboBox;


    public ComboBoxPanel3() {
        Integer[] petIndexArray = new Integer[petList.length];
        for (int i = 0; i < petList.length; i++) {
            petIndexArray[i] = i;
            ImageIcon imageIcon = new ImageIcon(petList[i] + ".gif");
            petImageIcons[i] = imageIcon;
            petImageIcons[i].setDescription(petList[i]);
        }
        this.petPictureComboBox = new JComboBox<>(petIndexArray);
        ComboBoxItemRenderer comboBoxItemRenderer = new ComboBoxItemRenderer();
        comboBoxItemRenderer.setPreferredSize(new Dimension(800, 180));
        this.petPictureComboBox.setRenderer(comboBoxItemRenderer);
       //this.petPictureComboBox.setMaximumRowCount(3);
        add(petPictureComboBox, BorderLayout.PAGE_START);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

    }


    private class ComboBoxItemRenderer extends JLabel implements ListCellRenderer<Integer> {

        public ComboBoxItemRenderer() {
            setOpaque(true);
            setHorizontalAlignment(CENTER);
            setVerticalAlignment(CENTER);
        }

        @Override
        public Component getListCellRendererComponent(JList<? extends Integer> list, Integer value, int index, boolean isSelected, boolean cellHasFocus) {

            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());


            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }

            ImageIcon imageIcon = petImageIcons[value];
            String text = petList[value];
            setIcon(imageIcon);
            setText(text);
            return this;
        }
    }
}
