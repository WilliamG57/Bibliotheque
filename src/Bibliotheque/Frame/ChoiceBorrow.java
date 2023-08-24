package Bibliotheque.Frame;

import Bibliotheque.ClassMetier.BD;
import Bibliotheque.ClassMetier.Bibliotheque;
import Bibliotheque.ClassMetier.Livre;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ChoiceBorrow extends JFrame {
    private JComboBox ComboBoxBorrow;
    private JTextField TextSearch;
    private JTextField TextTitle;
    private JTextField TextAuthor;
    private JButton BtnBorrow;
    private JButton ReturnBorrow;
    private JLabel IsbnBorrow;
    private JLabel TitleBorrow;
    private JLabel AuthorBorrow;
    private JPanel BorrowPanel;

    public ChoiceBorrow () {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().add(BorrowPanel);

        ComboBoxBorrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e.getSource();
                String s = (String) ComboBoxBorrow.getSelectedItem();
                if (Objects.equals(s, "BD")) {
                    IsbnBorrow.setText("Collection");
                    String TextSearch = null;
                } else {
                    IsbnBorrow.setText("Isbn");
                    int TextSearch = 0;
                }
            }
        });

        BtnBorrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ComboBoxBorrow.getSelectedItem().equals("Livre")) {
                    String s = TextSearch.getText();
                    for (Livre livre : Bibliotheque.getLivre()) {
                        if (livre.getIsbn() == Integer.parseInt(s)) {
                            TextTitle.setText(livre.getTitre());
                            TextAuthor.setText(livre.getAuteur());
                        }
                    }
                }
                if (ComboBoxBorrow.getSelectedItem().equals("BD")){
                    String s = TextSearch.getText();
                    for (BD Bd : Bibliotheque.getBD()) {
                        if (Bd.getCollection().equals(s)) {
                            TextTitle.setText(Bd.getTitre());
                            TextAuthor.setText(Bd.getAuteur());
                        }
                    }
                }
            }
        });

        ReturnBorrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                OptionChoice.DesignOptionChoice();
            }
        });

    }
    }
}
