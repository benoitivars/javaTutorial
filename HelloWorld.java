public class HelloWorld {
    public static void main(String[] args) {
        // Présence du capitaine
        boolean capitainePresent = true;
        
        // Genre du capitaine
        char genreCapitaine = 'F';

        // Âge du capitaine (nombre entier de type int)
        int ageCapitaine = 45;

        // Nombre de missions complétées (nombre entier de type short)
        short missionsCompletees = 256;

        // Nombre de membres d'équipage (nombre entier de type byte)
        byte membresEquipage = 100;

        // Distance parcourue par le vaisseau en années-lumière (nombre entier de type long)
        long distanceParcourue = 123456789012345L;

        // Température du vaisseau (nombre flottant de type float)
        float temperatureVaisseau = 27.4f;

        // Température du vide spatial (nombre flottant de type double)
        double temperatureVideSpatial = 0.00000000000000000000000000000000000000001d;

        // Nombre de thermo-conteneurs dans le vaisseau (variable de type int non initialisée)
        int nombreThermoConteneurs;

        // Attribution d'une valeur à la variable nombreThermoConteneurs
        nombreThermoConteneurs = 500;

        // Variable "var" pour déclarer le nombre de canons
        var nombreCanons = 50;

        // Nom du vaisseau (chaîne de caractères)
        String nomVaisseau = "L'Anzu Céleste";

        // Devise du vaisseau avec des double-guillemets
        String deviseVaisseau = "\"Guidés par Shamash\"";

        // Affichage des informations du capitaine
        System.out.println("Hello, World!");
        System.out.println("Capitaine présent : " + capitainePresent);
        System.out.println("Genre du capitaine : " + genreCapitaine);
        System.out.println("Âge du capitaine : " + ageCapitaine + " ans");
        System.out.println("Missions complétées : " + missionsCompletees);
        System.out.println("Membres d'équipage : " + membresEquipage);
        System.out.println("Distance parcourue : " + distanceParcourue + " années-lumière");
        System.out.println("Température du vaisseau : " + temperatureVaisseau + "°C");
        System.out.println("Température du vide spatial : " + temperatureVideSpatial + "°C");
        System.out.println("Nombre de thermo-conteneurs sur le vaisseau : " + nombreThermoConteneurs);
        System.out.println("Nombre de canons sur le vaisseau : " + nombreCanons);
        System.out.println("Nom du vaisseau : " + nomVaisseau);
        System.out.println("Devise du vaisseau : " + deviseVaisseau);
    }
}