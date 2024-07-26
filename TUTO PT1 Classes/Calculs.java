public class Calculs {
    public static void main(String[] args) {
        // Addition
        int somme = 4 + 8;
        System.out.println("La somme de 4 et 8 est : " + somme); // Affiche 12

        // Soustraction
        int soustraction = 5 - 3;
        System.out.println("La soustraction de 5 par 3 est : " + soustraction); // Affiche 2

        // Multiplication
        int multiplication = 7 * 8;
        System.out.println("La multiplication de 7 par 8 est : " + multiplication); // Affiche 56

        // Division sans reste
        int division1 = 12 / 4;
        System.out.println("La division de 12 par 4 donne : " + division1); // Affiche 3

        // Division avec reste
        int dividende2 = 15;
        int diviseur2 = 4;
        int division2 = dividende2 / diviseur2;
        int reste2 = dividende2 % diviseur2;
        System.out.println("La division de 15 par 4 donne un quotient de : " + division2 + " et un reste de : " + reste2); // Affiche 3 et 3

        // Division flottante
        float dividende3 = 15f;
        float diviseur3 = 4f;
        float division3 = dividende3 / diviseur3;
        float reste3 = dividende3 % diviseur3;
        // Note : L'opérateur % n'est pas couramment utilisé avec les types float pour obtenir le reste
        System.out.println("La division de 15 par 4 donne : " + division3); // Affiche 3.75
        System.out.println("Le reste de la division de 15 par 4 donne : " + reste3);
    }
}


