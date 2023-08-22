package Bibliotheque.Frame;

import Bibliotheque.ClassMetier.Gestionnaire;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;


public class AppFrame extends JFrame {

    public JPanel PanelMain;
    private JTextField txtPrenom;
    private JButton btnClick;
    private JLabel bienvenue;
    private JComboBox choiceGrade;
    private JTextArea matriculeText;
    private JLabel checkMatricule;

    public static void test() {
        AppFrame h = new AppFrame();
        h.setContentPane(h.PanelMain);
        h.setTitle("Hello");
        h.setSize(300, 300);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public AppFrame() {
        choiceGrade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e.getSource();
                String s = (String) choiceGrade.getSelectedItem();
                if (Objects.equals(s, "Client")) {
                    checkMatricule.setVisible(false);
                    matriculeText.setVisible(false);
                } else {
                    checkMatricule.setVisible(true);
                    matriculeText.setVisible(true);
                }
            }
        });
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = matriculeText.getText();
                if (choiceGrade.getSelectedItem().equals("Gestionnaire")) {
                    try {
                        for (Gestionnaire gestionnaire : Gestionnaire.getGestionnaire()) {
                            if (gestionnaire.getMatricule() == Integer.parseInt(s)) {
                                JOptionPane.showMessageDialog(btnClick, gestionnaire.getPrenom() + ", Hello");
                            }
                        }
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null, "le matricule ne comporte que des chiffres",
                                "Erreur saisie", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(btnClick, "Bienvenue à toi.");
                }
                ChoiceArticle switchpop = new ChoiceArticle();
                switchpop.setVisible(true);
            }
        });
    }


}