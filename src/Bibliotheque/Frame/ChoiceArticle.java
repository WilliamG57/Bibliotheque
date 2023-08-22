package Bibliotheque.Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceArticle extends JFrame{
    private JLabel LivreBd;
    private JButton livreButton;
    private JButton BDButton;
    private JPanel ChoicePanel;

    public ChoiceArticle() {
        AppFrame.setVisible(false);
        setTitle("Hello");
        setSize(300, 300);
        setVisible(true);
        getContentPane().add(ChoicePanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        livreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
