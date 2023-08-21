package Bibliotheque.ClassMetier;

public abstract class Personne {

    //Création de la class mère qui servira pour les clients et les gestionnaires
    private String nom;
    private String prenom;

    public Personne() {
    }

    public Personne(String nom, String prenom) {
        super();
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

}
