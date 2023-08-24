package Bibliotheque.Frame;

import Bibliotheque.ClassMetier.BD;
import Bibliotheque.ClassMetier.Bibliotheque;
import Bibliotheque.ClassMetier.Livre;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

;

public class ChoiceSearch extends JFrame {
    private JComboBox ComboBoxSearch;
    private JLabel IsbnSearch;
    private JLabel TitleSearch;
    private JLabel AuthorSearch;
    private JTextField TextSearch;
    private JTextField TextTitle;
    private JTextField TextAuthor;
    private JPanel SearchPanel;
    private JButton ReturnSearch;
    private JButton BtnSearch;
    private JTextField TextDispo;
    private JLabel DispoSearch;

    public ChoiceSearch() {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().add(SearchPanel);

        ComboBoxSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                e.getSource();
                String s = (String) ComboBoxSearch.getSelectedItem();
                if (Objects.equals(s, "BD")) {
                    IsbnSearch.setText("Collection");
                    String TextSearch = null;
                } else {
                    IsbnSearch.setText("Isbn");
                    int TextSearch = 0;
                }
            }
        });

        BtnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ComboBoxSearch.getSelectedItem().equals("Livre")) {
                    String s = TextSearch.getText();
                    for (Livre livre : Bibliotheque.getLivre()) {
                        if (livre.getIsbn() == Integer.parseInt(s)) {
                            TextTitle.setText(livre.getTitre());
                            TextAuthor.setText(livre.getAuteur());
                            TextDispo.setText(""+livre.getDispo());
                        }
                    }
                }
                if (ComboBoxSearch.getSelectedItem().equals("BD")){
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

        ReturnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                OptionChoice.DesignOptionChoice();
            }
        });

    }
}
