package Bibliotheque.Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppFrame extends JFrame {

    public JPanel PanelMain;
    private JTextField txtPrenom;
    private JButton btnClick;
    private JLabel bienvenue;
    private JComboBox ChoiceGrade;

    public AppFrame() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick, ChoiceGrade.getSelectedItem()+ ", Hello");
            }
        });
    }
    public static void test() {
        AppFrame h = new AppFrame();
        h.setContentPane(h.PanelMain);
        h.setTitle("Hello");
        h.setSize(300,400);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
