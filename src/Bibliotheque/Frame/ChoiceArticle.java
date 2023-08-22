package Bibliotheque.Frame;

import javax.swing.*;

public class ChoiceArticle extends JFrame{
    private JLabel LivreBd;
    private JButton livreButton;
    private JButton BDButton;

    public ChoiceArticle() {
        setTitle("Hello");
        setSize(300, 300);
        setVisible(true);
        getContentPane().add(LivreBd);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
