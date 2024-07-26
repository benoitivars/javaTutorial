# TUTO JAVA - PARTIE 2

Ce tutoriel reprend la suite directe de la première partie, qui nous avait appris ce qu'est Java, son histoire, son intérêt, comment l'installer et toute une série de notions comme la compilation, l'exécution, les variables statiques, les différents types de variables primitives, une introduction à la variable String et tous les opérateurs de base. Nous avons déjà couvert les bases de Java.

Maintenant, nous devons aller un peu plus loin. Nous allons voir les **structures conditionnelles** telles que `if`, `else if`, et `else`, les opérateurs ternaires, ainsi que les boucles `while` et `for`. Toutes ces structures nécessitent une condition pour que le code commence ou cesse de s'exécuter, marquant le début de l'automatisation.

Avant d'aborder ce point, nous devons commencer par nous intéresser de nouveau à la structure d'une classe en Java, faire une seconde autopsie, pour découvrir la notion de **bloc d'instructions**, où il se situe dans la classe et comment nous pouvons jouer avec.

Enfin, nous verrons après la notion **d'objet**, qui va encore plus loin dans l'exploration de nos classes.

## 1. Seconde anatomie d'une classe Java

Reprenons ici notre classe `HelloWorld.java`, qui contient en fait bien plus des variables dignes d'un vaisseau spatial que du simple affichage d'une `String` "Hello World!".

```Java
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
```

Si on regarde bien, il y a des choses qui devraient, de loin, vous rappeler le JavaScript. Il s'agit en fait des **accolades** ! Il y a en fait deux jeux d'accolades :

- Un qui commence directement après la déclaration de la classe
- Le second après la ligne d'instruction `public static void main` (que nous expliquerons bientôt, patience !)

Ce double-jeu d'accolades s'accompagne de trois niveaux **d'indentation** :

- Le premier, le plus près de la marge gauche, où on déclare la classe
- Le second juste en dessous la déclaration de variable, et est compris dans le *premier jeu d'accolades*
- Le troisième juste en dessous la ligne `public static void main`, et est compris dans le *second jeu d'accolades*

Ce que nous appelons le bloc d'instructions est compris au troisième niveau d'indentation/dans le second jeu d'accolades ! Et on l'appelle "bloc d'instructions" car c'est là que sont exécutées les différentes instructions !

Ce que je veux vous apprendre ici est double :

- D'abord, on peut avoir plusieurs blocs d'instruction différents, les uns en dessous des autres, dans l'ordre dans lequel on veut qu'ils s'exécutent, qu'on inclut dans le *second jeu d'accolades*, créant ainsi plusieurs jeux d'accolades étant tous à un *quatrième niveau d'indentation*.
- Ensuite, les variables peuvent être déclarées en dehors des sous-blocs d'instructions, juste sous la ligne `public static void main`, dans le *second jeu d'accolades*

L'idée ici, c'est que dans notre `classe`, précisément dans les blocs d'opération deux nivaux d'exécution : le niveau **global** qui concerne ce qu'il se passe au niveau du *bloc d'instruction principal* et le niveau **local**, qui ne concerne que chaque sous-bloc d'instruction spécifiquement.

Sachez aussi que vous pouvez avoir des sous-sous-blocs d'instructions indentés dans le bloc parent, mais cette pratique est à effectuer avec parcimonie car on a vite fait de se perdre si on ne fait pas attention. Demandez-vous toujours, à la création d'un bloc d'instruction indenté, s'il est absolument éncessaire à votre code.

Voici un modèle pour illustrer :

```Java
public class OperationsDistinctes {

    public static void main(String[] args) {
        // variables globales
            
            //premier sous-bloc d'instructions
            {
                //variables spécifiques du premier sous-bloc d'instructions, pouvant combiner au besoin les variables globales
                //instructions du premier sous-bloc d'instructions
            }
            {
                //variables spécifiques du second sous-bloc d'instructions, pouvant combiner au besoin les variables globales
                //instructions du second sous-bloc d'instructions
            }
    }
}
```

Voilà comment on peut essayer de mettre les choses en pratique :

- Créer la classe OperationsDistinctes.
- Déclarer deux variables de type `int` comprises entre 0 et 9 en dehors des sous-blocs d'instructions.
- Avoir deux sous-blocs d'instruction.
- Dans le premier sous-bloc d'instruction, afficher une `String formatée` reprenant la somme de ces deux nombres. Créez la sous-variable d'addition pour votre sous-bloc d'instructions.
- Dans le second sous-bloc d'instruction, afficher une `String formatée` reprenant la différence entre ces deux nombres.  Créez la sous-variable d'addition pour votre sous-bloc d'instructions.

ATTENTION : il vaut mieux formater toutes ses variables au format `int`, ça rend les opérations moins aventureuses !

AUTRE CONSEIL : lorsque vous chercherez probablement à afficher des String pour les réponses de manière formatée avec `printf`, vos affichages serontt raités les uns à la suite de l'autre, comme s'il s'agissait d'une même ligne, alors qu'il y en a deux distinctes. C'est l'occasion de vous introduire une commande spécifique à Java, quand on travaille sur des `String` et qu'on peut passer à la ligne, comme avec le `\n` en JavaScript. Pour Java, il s'agit de **`%n`**, que vous devrez mettre à la fin de la première `String formatée` que vous voudrez afficher !

Vous trouverez la correction dans le fichier "JAVA-SOLUTIONS.md".

Une fois que vous serez à l'aise avec cet exercice, créez vos propres codes avec variables globales, sous-blocs d'exécutions effectuant les opérations que vous demandez, histoire de vous amuser comme vous l'entendez !

### 1.2. Enregistrer la valeur d'un résultat d'un sous-bloc d'opérations au niveau global

Voici le dernier point spécifique que je veux aborder ici. Il n'est pas rare, quand on construit ses algorithmes, qu'on enregistre un résultat obtenu lors d'une étape pour l'utiliser ultérieurement.

Si vous vous rappelez des problèmes de géométrie au collège/lycée où l'on vous demandait, sur base de vos connaissances des axiomes de la géométrie euclidienne, de déduire l'amplitude d'un angle donné ou la longueur d'un segment de droite, il arrivait fréquemment que vous deviez réutiliser une valeur précédement déduite pour avancer dans vos déductions.

En algorithmie, c'est pareil : on doit retenir des valeurs intermédiaires pour éventuellement les utiliser ultérieurement !

Pour ce faire, les variables que vous déclarez dans les sous-blocs d'opération doivent aussi être définies au niveau global, mais alors de manière non définie à l'image d'un `resultat;`, qui serait définie dans un sous-bloc d'opération comme étant, par exemple `resultat = variable1 +variable2;`; ce qui vous permettra, , un `System.out.printf` à l'appui au niveau "global", de démontrer que le résultat obtenu a une existence au delà du sous-bloc où sa valeur a été déterminée !

Pour comprendre, voici un code illsutratif :

```Java
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
```

Si vous regardez bien ce code, cous voyez que le résultat de `somme` n'est utilisé qu'au niveau *local*, tanfis que la valeur de `resultat` a une porté *globale*.

### 1.3. Conclusion récapitulative

Dans cette section, nous avons approfondi la compréhension de la structure d'une classe Java en nous concentrant sur les blocs d'instructions et les niveaux d'indentation. Nous avons appris qu'une classe peut contenir plusieurs sous-blocs d'instructions, chacun ayant ses propres variables spécifiques tout en accédant aux variables globales. Cette organisation nous permet de structurer et d'exécuter des instructions de manière ordonnée et efficace.

Nous avons également vu comment les variables peuvent être déclarées en dehors des sous-blocs d'instructions pour être utilisées dans différents contextes au sein de la méthode `main`. En pratiquant avec des exemples concrets, tels que la classe `OperationsDistinctes`, nous avons appliqué ces concepts pour mieux les comprendre et les maîtriser.

Enfin, nous avons illustré l'importance de l'enregistrement des résultats intermédiaires obtenus dans les sous-blocs d'instructions, et comment ces valeurs peuvent être utilisées globalement dans le programme. L'exemple de la classe `LocalToGlobal` a permis de démontrer cette pratique courante en algorithmie.

Maintenant que vous êtes à l'aise avec ces notions, vous êtes prêts à explorer les **structures conditionnelles**, qui vous permettront de contrôler le flux de votre programme de manière plus sophistiquée.

## 2. Les structures conditionnelles

Nous allons ici réviser un classique de la programmation, le **if... else** ! Même si vous connaissez sa logique et ses structures, commençons par un petit rappel strictement algorithmique de ce qu'est le `if... else`, comment il est sensé fonctionner et ses usages concrets.

### 2.1. Le if... else, rappel d'une structure majeure en algorithmie

Le `if... else` est une structure logique centrale en programmation, car elle eprmet d'exécuter certaines isntructions à  certaines conditions. Jusqu'à présent, Java fonctionnait de manière **procédurale**, en exécutant les isntructions els unes à la suite des autres, dans l'ordre où elles apparaissaient dans les unes en dessous des autres dans les lignes de nos IDE comme c'est mon caas, ou l'IDE de votre choix.

Or, si la plus grande aprtie d'un programme s'exécute de manière procédurale, parfois, il faut que certaines choses puissent se faire sous certaines conditions, ou laisser des choix à l'utilisateur.

