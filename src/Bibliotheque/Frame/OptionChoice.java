package Bibliotheque.Frame;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionChoice extends JFrame {
    private JPanel OptionChoicePanel;
    private JLabel TitleOption;
    private JButton OptionRendre;
    private JButton OptionEmprunter;
    private JButton OptionRecherche;
    private JButton OptionAjout;
    private JButton OptionRetour;

    public static void DesignOptionChoice () {
        OptionChoice x = new OptionChoice();
        x.setSize(300, 300);
        x.setLocationRelativeTo(null);
        x.setVisible(true);
        x.getContentPane().add(x.OptionChoicePanel);
    }

    public OptionChoice () {
        try {
            UIManager.setLookAndFeel( new NimbusLookAndFeel() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().add(OptionChoicePanel);
        OptionRetour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                AppFrame.test();
            }
        });

        OptionAjout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                ChoiceAjout x = new ChoiceAjout();
                x.setVisible(true);
            }
        });

        OptionEmprunter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                ChoiceBorrow x = new ChoiceBorrow();
                x.setVisible(true);
            }
        });

        OptionRecherche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                ChoiceSearch x = new ChoiceSearch();
                x.setVisible(true);
            }
        });
        dispose();
    }
}
