package one;

import javax.swing.*;

public class ButtonPanel extends JPanel {
    private final JButton brainButton = new JButton("Observable Button");

    public ButtonPanel() {
        add(brainButton);


        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        AngelListener angelListener = new AngelListener();
        DevilListener devilListener = new DevilListener();
        brainButton.addActionListener(angelListener);
        brainButton.addActionListener(devilListener);
    }
}
