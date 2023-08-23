package Bibliotheque.Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceArticle extends JFrame {
    private JLabel LivreBd;
    private JButton livreButton;
    private JButton BDButton;
    private JPanel ChoicePanel;

    public ChoiceArticle() {
        setTitle("Choix de l'article");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().add(ChoicePanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        livreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                OptionChoice x = new OptionChoice();
                x.setVisible(true);
            }
        });
        BDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                OptionChoice x = new OptionChoice();
                x.setVisible(true);
            }
        });
    }
}
