import java.util.Scanner;

public class PassWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String motDePasse = "1234";
        String essai = "";  // Initialisation de la variable essai
        int nombreDeTentatives = 0;  // Initialisation du compteur de tentatives

        while (!essai.equals(motDePasse)) {
            System.out.print("Devinez le mot de passe : ");
            essai = scanner.nextLine();  // Lire l'entrée utilisateur comme une chaîne
            nombreDeTentatives++;  // Incrémente le compteur à chaque tentative
        }

        System.out.println("Félicitations, vous avez deviné le bon mot de passe en " + nombreDeTentatives + " tentatives !");
    }
}