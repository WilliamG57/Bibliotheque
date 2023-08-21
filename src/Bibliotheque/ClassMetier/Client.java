package Bibliotheque.ClassMetier;

import Bibliotheque.Utilitaires.*;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Client extends Personne {
    //Récupération des données de la mère
    //Mise en place de la collection des clients
    private static final ArrayList<Client> Client = new ArrayList<Client>();
    private String email;


    public Client() {
        super();
    }

    public Client(String nom, String prenom, String email) {
        super(nom, prenom);
        this.setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void infoClient() {
        //Demande des informations du client
        Client client = new Client();
        Input.print("Veuillez saisir votre nom");
        client.setNom(Input.recupChaine(1));
        Input.print("Veuillez saisir votre prénom");
        client.setPrenom(Input.recupChaine(1));
        Input.print("veuillez saisir votre email");
        client.setEmail(Input.recupChaine(1));
        boolean emailValide = true;
        //Vérification de l'adresse mail avec la mise en place d'une exception et d'un regex
        try {
            emailValide = emailValide(client.email);
            Client.add(client);
        } catch (InputException ie) {
            Input.print(ie.getMessage());
        }
        if (!emailValide) {

        }
    }

    private static boolean emailValide(String email) throws InputException {
        String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,6}$";
        boolean bool = Pattern.matches(regex, email);
        if (!bool) {
            throw new InputException("email invalide");
        } else {
            return bool;
        }
    }
}
