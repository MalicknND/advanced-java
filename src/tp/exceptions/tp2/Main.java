package tp.exceptions.tp2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Validez un mot de passe en respectant les conditions suivantes :
        // - Le mot de passe doit comporter au moins 8 caractères.
        // - Il doit contenir des lettres majuscules et minuscules
        // - il doit contenir au minimum deux chiffres
        // - pour chaque condition non respectée, affichez un message d'erreur spécifique.
        // - Gerer les exceptions

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Entrez un mot de passe : ");
            String password = scanner.nextLine();

            try {
                validatePassword(password);
                System.out.println("Mot de passe valide !");
            } catch (Exception e) {
                System.out.println("Message d'erreur : " + e.getMessage());
            }


        }

    }

    public static void validatePassword (String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("Le mot de passe doit comporter au moins 8 caractères.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new Exception("Le mot de passe doit contenir au moins une lettre majuscule.");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new Exception("Le mot de passe doit contenir au moins une lettre minuscule.");
        }
        if (password.replaceAll("\\D", "").length() < 2) {
            throw new Exception("Le mot de passe doit contenir au moins deux chiffres.");
            }

    }
}


