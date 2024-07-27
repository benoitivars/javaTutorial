public class MacumbaFiesta {

    public static void main(String[] args) {
        // Déclaration d'une variable d'âge et d'une variable sur la quantité d'alcool ingéré'
        int age = 17;
        boolean estAlcoolise = false;

        // Condition initiale pour rentrer au Macumba Fiesta
        if (age >= 18 && estAlcoolise == false) {
            System.out.println("Bonsoir, vous pouvez franchir les portes du Macumba Fiesta !");
        }

        // Condition où la personne est majeure et alcoolisée
        else if (age >= 18 && estAlcoolise == true) {
            System.out.println("Ah je suis désolé, ça ne va pas le faire ! Revenez une prochaine fois !");
        }

        // Situation dans laquelle la personne n'est pas majeure
        else if (age < 18 && estAlcoolise == false) {
            System.out.println("Désolé, t'as rien à faire ici, rentre chez toi !");
        }
    }
}

