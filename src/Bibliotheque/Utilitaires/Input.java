package Bibliotheque.Utilitaires;

import java.util.Scanner;

public class Input {
    //Raccourci pour alléger le code et éviter trop de répétition
    private static final Scanner scan = new Scanner(System.in);

    public static void print(String message) {
        System.out.println(message);
    }

    public static boolean print(boolean message) {
        System.out.println(message);
        return message;
    }

    public static String recupChaine(int type) {

        if (type == 0) {
            return scan.nextLine();
        } else {
            return scan.next();
        }
    }

    public static int recupInt() {
        System.out.println();
        return scan.nextInt();
    }
}
