package Bibliotheque.ClassMetier;


public abstract class Article {
    //Création de la class mère qui servira pour les livres et les BD


    private String auteur;
    private String titre;
    private boolean dispo;

    public Article() {
    }

    public Article(String auteur, String titre, boolean dispo) {
        this.setAuteur(auteur);
        this.setTitre(titre);
        this.setDispo(dispo);
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public boolean getDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public abstract void afficher();
}
