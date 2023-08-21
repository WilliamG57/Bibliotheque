package Bibliotheque.Utilitaires;

import Bibliotheque.ClassMetier.*;
import Bibliotheque.Utilitaires.*;

public class Switch {

    public static void switchAfficher() {
        //Mise en place du switch avec la boucle pour parcourir les ArrayList et les afficher
        int switchAfficher = Input.recupInt();
        switch (switchAfficher) {
            case 1 -> {
                Input.print("Afficher les BD");
                for (BD bd : Bibliotheque.getBD()) {
                    bd.afficher();
                }
            }
            case 2 -> {
                Input.print("Afficher les livres");
                for (Livre livres : Bibliotheque.getLivre()) {
                    livres.afficher();
                }
            }
        }
    }

    public static void choixAjout() {
        //Mise en place du switch d'ajout d'article
        int choixAjout = Input.recupInt();
        switch (choixAjout) {
            case 1 -> Bibliotheque.ajoutBD();
            case 2 -> Bibliotheque.ajoutLivre();
        }
    }

    public static void switchRechercher() {
        //Mise en place du switch de recherche et d'affichage du résultat
        int switchRechercher = Input.recupInt();
        int choice;
        String collec;
        switch (switchRechercher) {
            case 1 -> {
                Input.print("Quelle collection?");
                collec = Input.recupChaine(1);
                BD tampon1 = BD.rechercheParCollection(Bibliotheque.getBD(), collec);
                tampon1.afficher();
            }
            case 2 -> {
                Input.print("Donner l'Isbn du livre rechercher");
                choice = Input.recupInt();
                Livre tampon = Livre.rechercheParIsbn(Bibliotheque.getLivre(), choice);
                tampon.afficher();
            }
        }
    }

    public static void switchEmprunter() {
        int switchEmprunter = Input.recupInt();
        switch (switchEmprunter) {
            case 1 -> BD.empruntBd();
            case 2 -> Livre.empruntLivre();
        }
    }

    public static void switchRendre() {
        int switchRendre = Input.recupInt();
        int choice;
        String collec;
        switch (switchRendre) {
            case 1 -> {
                Input.print("Saisir la collection de la BD à rendre");
                collec = Input.recupChaine(1);
                BD tampon1 = BD.rechercheParCollection(Bibliotheque.getBD(), collec);
                tampon1.setDispo(true);
                tampon1.afficher();
            }
            case 2 -> {
                Input.print("Saisir l'Isbn du livre à rendre");
                choice = Input.recupInt();
                Livre tampon = Livre.rechercheParIsbn(Bibliotheque.getLivre(), choice);
                tampon.setDispo(true);
                tampon.afficher();
            }
        }
    }

}
