package Bibliotheque.Frame;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

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
        try {
            UIManager.setLookAndFeel( new NimbusLookAndFeel() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().add(AjoutPanel);
    }
}
