package Bibliotheque.ClassMetier;

import Bibliotheque.Utilitaires.Input;

import java.util.ArrayList;

public class BD extends Article {
    //Récupération des données de la mère

    private String collection;

    public BD() {
        super();
    }
    public BD(String auteur, String titre, String collection, boolean dispo) {
        super(auteur, titre, dispo);
        this.setCollection(collection);
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }


    @Override
    public void afficher() {
        //Mise en place de l'affichage obligatoire (abstract dans la class mère)
        System.out.print(" -Titre : " + getTitre());
        System.out.print(" -Auteur : " + getAuteur());
        System.out.print(" -Collection : " + getCollection());
        System.out.println(" -Disponibilité : " + getDispo());
    }

    public static BD rechercheParCollection(ArrayList<BD> BD, String collection) {
        //Boucle pour parcourir la collection de BD et comparer chaque élément à l'élément demandé
        for (BD Bd : BD) {
            if (Bd.getCollection().equals(collection)) {
                return Bd;
            }
        }
        return null;
    }

    public static void empruntBd () {
        //Mise en place du système d'emprunt avec la modification du boolean
        String collec;
        Input.print("Quelle collection voulez-vous emprunter?");
        collec = Input.recupChaine(1);
        BD tampon1 = BD.rechercheParCollection(Bibliotheque.getBD(), collec);
        if (tampon1.getDispo() == false) {
            Input.print("Cette BD n'est pas disponible pour le moment");
        } else {
            tampon1.setDispo(false);
            tampon1.afficher();
            Input.print("La BD" + tampon1.getTitre() + "est désormais indisponible");
        }
    }
}
