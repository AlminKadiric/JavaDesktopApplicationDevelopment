import javax.swing.*;
//1.Kontejneri:Jframe ,JPanel
//2.GUI Kontrolle: JButton,JCheckBox,JRadioButton
//3.LayoutManager->BBorderlayout


public class Main {
    public static void main(String[] args) {

        Runnable runnable = Main::showGUI;
     //   new Thread(runnable).start();
      //  showGUI();
        SwingUtilities.invokeLater(runnable);

    }

    static void showGUI() {
        System.out.println(Thread.currentThread().getName());
        JFrame jFrame = new JFrame();
        jFrame.setSize(500, 400);
        jFrame.setTitle("Naslov moga prozora!!!");
        ButtonPanel buttonPanel = new ButtonPanel();
        jFrame.setContentPane(buttonPanel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
