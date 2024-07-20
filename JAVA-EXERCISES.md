# Exercices en Java

## 1. Le Marduk Volant

### Exercice : Correction des Erreurs de Réassignation et de Typage

**Objectif :** Identifier et corriger les erreurs de typage et de réassignation dans le code.

**Contexte :** Vous travaillez sur un vaisseau secondaire nommé "Le Marduk Volant". Malheureusement, le code actuel comporte plusieurs erreurs de typage et des fautes d'orthographe. Votre tâche est de corriger ces erreurs pour que le programme compile et fonctionne correctement.

**Instructions :** 

1. Copiez le code ci-dessous dans votre IDE Java., ou ouvrez le fichier MardukVOlant.Java.
2. Identifiez et corrigez les erreurs de typage et de réassignation.
3. Corrigez les fautes d'orthographe dans les noms de variables et les chaînes de caractères.
4. Faites en sorte que le programme compile sans erreurs et affiche les informations correctes sur le vaisseau.

```java
public class MardukVolant {
    public static void main(String[] args) {
        // Présence du capitaine
        bollean capitainePresant = ture;
        
        // Genre du capitaine
        char genrCapitaine = 'M';

        // Âge du capitaine (nombre entier de type int)
        int ageCapitaine = 50;
        ageCapitaine = "cinquante";

        // Nombre de missions complétées (nombre entier de type short)
        shrot missionsComplete = 150;

        // Nombre de membres d'équipage (nombre entier de type byte)
        btye membresEquipage = 80;
        membresEquipage = 300;

        // Distance parcourue par le vaisseau en années-lumière (nombre entier de type long)
        long distanceParcourue = 98765432101234L;
        distanceParcourue = 34.7;

        // Température du vaisseau (nombre flottant de type float)
        float temperatureVaisseau = 18.9f;
        temperatureVaisseau = "dix-huit point sept"; 

        // Nom du vaisseau (chaîne de caractères)
        String nomVaisseau = "Le Marduk Volant";

        // Devise du vaisseau avec des double-guillemets
        String deviseVaisseau = ""Vers les étoiles"";

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

### Conseils

- Assurez-vous que chaque variable est déclarée avec le bon type et que les valeurs réassignées sont compatibles avec ce type.
- Corrigez les fautes d'orthographe dans les noms de variables et les chaînes de caractères.
- Utilisez les guillemets doubles correctement pour les chaînes de caractères.

### Questions de réflexion

1. Pourquoi est-il important de corriger les types de variables incorrects avant la compilation ?
2. Qu'est-ce que cela implique si on utilise des types de variables incorrects dans un programme plus complexe ?

### Conseils supplémentaires

- Vérifiez toujours le type de données que vous manipulez pour éviter les erreurs de compilation.
- Utilisez des noms de variables clairs et cohérents pour améliorer la lisibilité de votre code.
- Prenez l'habitude de relire et de tester votre code régulièrement pour détecter et corriger les erreurs le plus tôt possible.
