package Bibliotheque.ClassMetier;

import Bibliotheque.Utilitaires.*;

import java.util.ArrayList;

public class Bibliotheque {
    //Création des collections livres et BD
    private static final ArrayList<Livre> livres = new ArrayList<Livre>();
    private static final ArrayList<BD> BD = new ArrayList<BD>();


    public static ArrayList<BD> getBD() {
        return BD;
    }

    public static ArrayList<Livre> getLivre() {
        return livres;
    }

    public static void addLivre() {
        //Mise en place d'une base de livre
        Livre book1 = new Livre("Christopher Paolini", "Eragon", 54, true);
        Livre book2 = new Livre("Robin Hobb", "L'assassin Royal", 12, true);
        Livre book3 = new Livre("Franck Thilliez", "Le Manuscrit Inachevé", 8, true);
        Livre book4 = new Livre("Samantha Shannon", "Le Prieuré de l'Oranger", 68, true);
        livres.add(book1);
        livres.add(book2);
        livres.add(book3);
        livres.add(book4);

    }

    public static void ajoutLivre() {
        //Possibilité de rajouter des livres soi même
        Livre livre = new Livre();
        Input.print("Titre du livre à ajouter");
        livre.setTitre(Input.recupChaine(1));
        Input.print("Auteur du livre à ajouter");
        livre.setAuteur(Input.recupChaine(1));
        Input.print("Le code Isbn du livre");
        livre.setIsbn(Input.recupInt());
        livre.setDispo(true);
        livres.add(livre);
        Input.print("Le livre " + livre.getTitre() + "est ajouté à la bibliotheque");
    }

    public static void addBd() {
        //Mise en place d'une base de BD
        BD bd1 = new BD("Jean-Luc Masbou", "Conan le Cimmérien", "Conan", true);
        BD bd2 = new BD("Herge", "Tintin au tibet", "Tintin", true);
        BD bd3 = new BD("Goscinny", "Asterix chez les Goth", "Astérix", true);
        BD bd4 = new BD("Jean-luc Cambier", "L'héritage Jacobs", "Black et Mortimer", true);
        BD.add(bd1);
        BD.add(bd2);
        BD.add(bd3);
        BD.add(bd4);
    }

    public static void ajoutBD() {
        //Possibilité d'ajouter des BD soi même
        BD bd = new BD();
        Input.print("Titre de la BD à ajouter");
        bd.setTitre(Input.recupChaine(1));
        Input.print("Auteur de la BD à ajouter");
        bd.setAuteur(Input.recupChaine(1));
        Input.print("Collection de la BD");
        bd.setCollection(Input.recupChaine(1));
        Input.print("Disponibilité de la BD, true ou false");
        bd.setDispo(Input.print(true));
        BD.add(bd);
    }
}
