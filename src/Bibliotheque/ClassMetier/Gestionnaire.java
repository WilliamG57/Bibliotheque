package Bibliotheque.ClassMetier;

import Bibliotheque.Utilitaires.Input;

import java.util.ArrayList;

public class Gestionnaire extends Personne {
    //Récupération des données de la mère

    private int matricule;
    //Mise en place de la collection des gestionnaires
    private static final ArrayList<Gestionnaire> gestionnaires = new ArrayList<Gestionnaire>();


    public Gestionnaire(String nom, String prenom, int matricule) {
        super(nom, prenom);
        this.setMatricule(matricule);
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }


    public static void addGestionnaire() {
        //Ajout de la liste des gestionnaires à la collection
        Gestionnaire gestionnaire1 = new Gestionnaire("Truc", "Muche", 1234);
        Gestionnaire gestionnaire2 = new Gestionnaire("Machin", "Bidule", 5678);
        Gestionnaire gestionnaire3 = new Gestionnaire("Kouik", "Kouak", 9123);
        gestionnaires.add(gestionnaire1);
        gestionnaires.add(gestionnaire2);
        gestionnaires.add(gestionnaire3);
    }

    public static void connectGestionnaire() {
        //Mise en place de la connection des gestionnaires au lancement du programme
        int connectGestionnaire = Input.recupInt();
        switch (connectGestionnaire) {
            case 1 -> {
                Input.print("Donner votre matricule");
                int matricule = Input.recupInt();
                for (Gestionnaire gestionnaire : gestionnaires) {
                    if (gestionnaire.getMatricule() == matricule) {
                        Input.print("Bonjour " + gestionnaire.getPrenom() + "!");
                        return;
                    }
                }
            }
            case 2 -> Input.print("Bienvenue à la bibliothèque.");
        }
    }
}