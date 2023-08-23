package Bibliotheque.Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionChoice extends JFrame {
    private JPanel OptionChoice;
    private JLabel TitleOption;
    private JButton OptionRendre;
    private JButton OptionEmprunter;
    private JButton OptionRecherche;
    private JButton OptionAjout;
    private JButton OptionRetour;

    public OptionChoice () {
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().add(OptionChoice);
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
    }
}
