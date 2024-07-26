# SOLUTIONS DES EXERCICES

## 1. Le Marduk Volant

```Java
public class MardukVolant {
    public static void main(String[] args) {
        // Présence du capitaine
        boolean capitainePresant = true;

        // Genre du capitaine
        char genrCapitaine = 'M';

        // Âge du capitaine (nombre entier de type int)
        int ageCapitaine = 50;

        // Nombre de missions complétées (nombre entier de type short)
        short missionsComplete = 150;

        // Nombre de membres d'équipage (nombre entier de type byte)
        byte membresEquipage = 80;
        membresEquipage = 124;

        // Distance parcourue par le vaisseau en années-lumière (nombre entier de type long)
        long distanceParcourue = 98765432101234L;
        distanceParcourue = 34L;

        // Température du vaisseau (nombre flottant de type float)
        float temperatureVaisseau = 18.9f;
        temperatureVaisseau = 18.7f;

        // Nom du vaisseau (chaîne de caractères)
        String nomVaisseau = "Le Marduk Volant";

        // Devise du vaisseau avec des double-guillemets
        String deviseVaisseau = "\"Vers les étoiles\"";

        // Affichage des informations du capitaine
        System.out.println("Hello, World!");
        System.out.println("Capitaine présent : " + capitainePresant);
        System.out.println("Genre du capitaine : " + genrCapitaine);
        System.out.println("Âge du capitaine : " + ageCapitaine + " ans");
        System.out.println("Missions complétées : " + missionsComplete);
        System.out.println("Membres d'équipage : " + membresEquipage);
        System.out.println("Distance parcourue : " + distanceParcourue + " années-lumière");
        System.out.println("Température du vaisseau : " + temperatureVaisseau + "°C");
        System.out.println("Nom du vaisseau : " + nomVaisseau);
        System.out.println("Devise du vaisseau : " + deviseVaisseau);
    }
}
```

## 2. OperationsDistinctes.java

```Java
public class OperationsDistinctes {

    public static void main(String[] args) {
        int nombre1 = 7;
        int nombre2 = 2;
            {
            int somme = nombre1 + nombre2;
            System.out.printf("La somme de %d et de %d est égale à %d%n", nombre1, nombre2, somme);
            }
            {
            int difference = nombre1 - nombre2;
            System.out.printf("La différence de %d et de %d est égale à %d", nombre1, nombre2, difference);
            }
    }
}
```
