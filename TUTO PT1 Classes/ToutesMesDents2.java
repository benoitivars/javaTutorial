public class ToutesMesDents2 {
    public static void main(String[] args) {
        // Définir l'âge et le nom comme des variables
        int age = 35;
        String name = "Benoît";

        // Utiliser String.format pour créer une chaîne de caractères formatée
        String message = String.format("Bonjour, je m'appelle %s et j'ai %d ans et toutes mes dents.", name, age);

        // Afficher le message
        System.out.println(message);
    }
}