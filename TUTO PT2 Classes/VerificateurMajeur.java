public class VerificateurMajeur {
    public static void main(String[] args) {
        int age = 18;  // Définition de l'âge
        
        // Structure ternaire pour déterminer si la personne est majeure
        boolean estMajeur = (age >= 18) ? true : false;
        
        // Affichage du résultat
        System.out.println("Âge : " + age);
        System.out.println("Est majeur : " + estMajeur);
    }
}