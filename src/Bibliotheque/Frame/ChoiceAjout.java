package Bibliotheque.Frame;

import javax.swing.*;

public class ChoiceAjout extends JFrame{
    private JPanel AjoutPanel;
    private JPanel AjoutPanelArticle;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JLabel AuteurLivre;
    private JLabel ISBNLivre;
    private JLabel Titre;
    private JLabel TitreAjoutLivre;
    private JComboBox comboBox1;

    public ChoiceAjout() {
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().add(AjoutPanel);
    }
}
