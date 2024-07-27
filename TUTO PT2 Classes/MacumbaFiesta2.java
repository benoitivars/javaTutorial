public class MacumbaFiesta2 {

    public static void main(String[] args) {
        // Déclaration d'une variable d'âge et d'une variable sur la quantité d'alcool ingéré
        int age = 17; // Vous pouvez changer cette valeur pour tester différentes situations
        boolean estAlcoolise = false; // Vous pouvez changer cette valeur pour tester différentes situations

        // Vérification de l'âge
        if (age < 18) {
            System.out.println("Désolé, t'as rien à faire ici, rentre chez toi !");
            return; // Arrête l'exécution du programme si la personne n'est pas majeure
        }

        // Vérification de l'état d'alcoolémie pour une personne majeure
        if (!estAlcoolise) {
            System.out.println("Bonsoir, vous pouvez franchir les portes du Macumba Fiesta !");
        } else {
            System.out.println("Ah je suis désolé, ça ne va pas le faire ! Revenez une prochaine fois !");
        }
    }
}