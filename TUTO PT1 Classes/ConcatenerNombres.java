public class ConcatenerNombres {
    public static void main(String[] args) {
        int nombre1 = 5;
        int nombre2 = 3;

        // Conversion des entiers en chaînes de caractères et concaténation
        String resultat = String.valueOf(nombre1) + String.valueOf(nombre2);

        // Affichage du résultat
        System.out.println("La concaténation de " + nombre1 + " et " + nombre2 + " est : " + resultat);

        // Pour comparaison, l'addition normale des entiers
        int somme = nombre1 + nombre2;
        System.out.println("L'addition de " + nombre1 + " et " + nombre2 + " est : " + somme);
    }
}
