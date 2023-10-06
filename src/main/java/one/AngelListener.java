package one;

import javax.accessibility.Accessible;
import javax.accessibility.AccessibleTable;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AngelListener  implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"Nemoj. Zazalit ces !!!");
    }
}
