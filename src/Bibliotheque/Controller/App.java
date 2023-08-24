package Bibliotheque.Controller;

import Bibliotheque.ClassMetier.*;
import Bibliotheque.Frame.AppFrame;
import Bibliotheque.Utilitaires.*;

public class App {
    public static void main(String[] args) {

       AppFrame.test();

        int choice;

        Bibliotheque.addBd();
        Bibliotheque.addLivre();
        Gestionnaire.addGestionnaire();

        Input.print("1: Gestionnaire \n2: Client");
        Gestionnaire.connectGestionnaire();
        do {
            Input.print("Veuillez faire un choix :");
            Input.print(
                    "1 : Ajouter un article \n2 : Rechercher un article \n3 : Afficher tout les articles disponible \n4 : Emprunter un article \n5 : Rendre un article \n6 : 0 pour nous  quitter");
            choice = Input.recupInt();

            switch (choice) {
                case 1 -> {
                    Input.print("1 : Ajouter une BD\n2 : Ajouter un livre");
                    Switch.choixAjout();
                }
                case 2 -> {
                    Input.print("1 : Rechercher une BD\n2 : Rechercher un livre");
                    Switch.switchRechercher();
                }
                case 3 -> {
                    Input.print("Afficher les articles disponible");
                    Input.print("1 : Afficher les BD \n2 : Afficher les livres");
                    Switch.switchAfficher();
                }
                case 4 -> {
                    Input.print("1 : Emprunter une BD\n2 : Emprunter un livre");
                    Switch.switchEmprunter();
                }
                case 5 -> {
                    Input.print("1 : Rendre une BD\n2 : Rendre un livre");
                    Switch.switchRendre();
                }
                default -> Input.print("Choix incorrect");
            }

        } while (choice != 0);
    }
}