import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombreADeviner = 7;
        int essai = 0;  // Initialisation de la variable essai
        int nombreDeTentatives = 0;  // Initialisation du compteur de tentatives

        while (essai != nombreADeviner) {
            System.out.print("Devinez le nombre : ");
            essai = scanner.nextInt();
            nombreDeTentatives++;  // Incrémente le compteur à chaque tentative
        }

        System.out.println("Félicitations, vous avez deviné le bon nombre en " + nombreDeTentatives + " tentatives !");
    }
}