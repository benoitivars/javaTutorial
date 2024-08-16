public class VerificateurJourSemaine {
    public static void main(String[] args) {
        int jour = 7;  // Définition du jour sous forme de nombre (1 = Lundi, 2 = Mardi, etc.)

        switch (jour) {
            case 1:
                System.out.println("C'est Lundi, le premier jour de la semaine de travail.");
                break;
            case 2:
                System.out.println("C'est Mardi, le deuxième jour de la semaine de travail.");
                break;
            case 3:
                System.out.println("C'est Mercredi, le milieu de la semaine de travail.");
                break;
            case 4:
                System.out.println("C'est Jeudi, le quatrième jour de la semaine de travail.");
                break;
            case 5:
                System.out.println("C'est Vendredi, le dernier jour de la semaine de travail.");
                break;
            case 6:
                System.out.println("C'est Samedi, c'est le week-end !");
                break;
            case 7:
                System.out.println("C'est Dimanche, c'est le week-end !");
                break;
            default:
                System.out.println("Nombre inconnu, veuillez entrer un nombre entre 1 et 7.");
                break;
        }
    }
}