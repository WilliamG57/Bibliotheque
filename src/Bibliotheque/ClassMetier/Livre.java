package Bibliotheque.ClassMetier;

import Bibliotheque.Utilitaires.Input;

import java.util.ArrayList;

public class Livre extends Article {
    //Récupération des données de la mère
    private int isbn;

    public Livre() {
        super();
    }

    public Livre(String auteur, String titre, int isbn, boolean dispo) {
        super(auteur, titre, dispo);
        this.setIsbn(isbn);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public void afficher() {
        //Mise en place de l'affichage obligatoire (abstract dans la class mère)
        System.out.print(" -Titre: " + getTitre());
        System.out.print(" -Auteur: " + getAuteur());
        System.out.print(" -Code Isbn: " + getIsbn());
        System.out.println(" -Disponibilité: " + getDispo());
    }

    public static Livre rechercheParIsbn(ArrayList<Livre> livres, int isbn) {
        //Boucle pour parcourir la collection de livres et comparer chaque élément à l'élément demandé
        for (Livre livre : livres) {
            if (livre.getIsbn() == isbn) {
                return livre;
            }
        }
        return null;
    }

    public static void empruntLivre() {
        //Mise en place du système d'emprunt avec la modification du boolean
        int choice;
        Client.infoClient();
        Input.print("Donner l'Isbn du livre à emprunter");
        choice = Input.recupInt();
        Livre tampon = Livre.rechercheParIsbn(Bibliotheque.getLivre(), choice);
        if (!tampon.getDispo()) {
            Input.print("Ce livre n'est pas disponible pour le moment");
        } else {
            tampon.setDispo(false);
            tampon.afficher();
            Input.print("Le livre " + tampon.getTitre() + " n'est plus disponible");
        }
    }
}