public class LocalToGlobal {

    public static void main(String[] args) {
        // Déclaration de variables globales
        int a = 5;
        int b = 10;
        int resultat; // Variable globale non initialisée

        // Sous-bloc d'instructions
        {
            int somme = a + b; // Calcul de la somme
            resultat = somme-6; // Enregistrement du résultat dans la variable globale
            System.out.printf("La somme de %d et %d est : %d%n", a, b, somme);
        }

        // Utilisation du résultat global en dehors du sous-bloc
        System.out.printf("Le résultat final enregistré est : %d%n", resultat);
    }
}