public class EncoreUnePompe {
    public static void main(String[] args) {
        int pompes = 0;  // Initialisation du compteur de pompes

        do {
            pompes++;  // Incrémentation du nombre de pompes
            System.out.println("Pompe " + pompes);
        } while (pompes < 10);  // La boucle continue tant que moins de 10 pompes ont été faites

        System.out.println("Ouf, enfin terminé ! Vous avez fait vos " +pompes+" pompes !");
    }
}