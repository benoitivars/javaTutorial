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

Le `if... else` est une structure logique centrale en programmation, car elle eprmet d'exécuter certaines isntructions à  certaines conditions. Jusqu'à présent, Java fonctionnait de manière **procédurale**, en exécutant les isntructions les unes à la suite des autres, dans l'ordre où elles apparaissaient dans les unes en dessous des autres dans les lignes de nos IDE comme c'est mon caas, ou l'IDE de votre choix.

Or, si la plus grande aprtie d'un programme s'exécute de manière procédurale, parfois, il faut que certaines choses puissent se faire sous certaines conditions, ou laisser des choix à l'utilisateur.

Et des situations comme ça, on en rencontre tout le temps : vérifier qu'un mot de passe est valide, donner la possibilité dans un jeu au joueur de choisir un embranchement dans l'histoire principale, un algorithme qui permet de vérifier si els gens pointent à l'heure au travail, vérifier si le solde sur un compte bancaire est suffisant pour effectuer une transaction, si une trotinette électrique ou tout autre véhicule de mobilité partagée est présent dans les environs, ... la liste est longue.

Tout ça fonctionne grâce au ``if... else**`` qui va poser une **condition** qui a une valeur *booléenne*, qui se vérifie, ou non. Et en fonction de si la condition est vérifiée ou non, l'algorithme peut faire certaines choses au lieu d'autres, *exécuter un sous-bloc d'instruction spécifique plutôt qu'un autre*, on quitte la logique jusque là utilisée de l'exécution d'un code de part en part. Maintenant, certains bouts du codes seront exécutés sous certaines conditions, et d'autres sous d'autres conditions !

Tâchons de décomposer, algorithmiquement parlant, la amnière dont fonctionne le `else... if`.

#### 2.1.1. La structure du `if ... else`

Pour comprendre comment fonctionne le `else... if`, commençons par une simple traduction : en français, ça signifie **"si... ou bien si"**. Et c'est la quintessence de cette notion : *SI* une condition donnée est remplie, alors on fait ceci. *OU BIEN SI* telle autre condition est remplie, on fait cela.

C'est comme ça que fonctionne l'achat d'alcool en magasin, si le vendeur respecte la législation en vigeur : *SI* le client est majeur, il peut acheter de l'alcool *OU BIEN SI* le client est mineur, il n'a pas le droit d'acheter de l'alcool. Il va d esoi que le vendeur ne peut pas et vendre l'alcool et reffuser la vente ! Seule une des deux opérations est possible. Et il faut que la condition qui la déclenche soit *vraie*, c'est à dire que sa `valeur booléenne soit égale à "true"` !

Et qui dit *valeur booléenne* dit **opérateurs relationnels** et dans une moindre mesure, **opérateurs logiques** ! C'est grâce à ces opérateurs qu'on peut vérifier si une condition est vérifiée ou non !

La manière dont les choses vont se structurer est la suivante : on va repartir de la structure avec plusieurs sous-blocs d'instructions, mais on va à chaque fois mettre au dessus la condition, qui va permettre d'indiquer à java que le sous-bloc d'instruciton en doit être exécuté que si la condition est remplie.

Prennons ce code, qui reprend les consignes données au videur du Macumba Fiesta, on fait rentrer que les gens qui ont 18 ans ou plus :

```Java
public class MacumbaFiesta {

    public static void main(String[] args) {
        // Déclaration d'une variable d'âge'
        int age = 18;

        // Condition initiale pour rentrer au Macumba Fiesta
        if (age >= 18) {
            System.out.println("Bonsoir, vous pouvez franchir les portes du Macumba Fiesta !");
        }

        // Situation dans laquelle la personne n'est pas majeure
        else if (age < 18) {
            System.out.println("Désolé, t'as rien à faire ici, rentre chez toi !");
        }
    }
}
```

Si vous compilez ce code et l'exécutez, vous verrez ceci :

![Exécution du fichier MacumbaFiesta, en entrant un âge de 18 ans](images/partie5/MacumbaFiestaAge18.png)

Maintenant, si vous changez la viariable d'âge par 9, que vous compilez le code et l'exécutez, voilà ce que vous verrez :

![Exécution du fichier MacumbaFiesta, en entrant un âge de 9 ans](images/partie5/MacumbaFiestaAge9.png)

Maintenant, toute boite de nuit qui se respecte laisse rentrer les personnes majeures, et qui ne sont pas alcoolisées. Nous allons donc ajouter la variable `estAlcoolise` à notre code et affiner les conditons :

```Java
public class MacumbaFiesta {

    public static void main(String[] args) {
        // Déclaration d'une variable d'âge et d'une variable sur la quantité d'alcool ingéré'
        int age = 18;
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
```

Notez d'ailleurs dans ce code que j'utilise le double opérateur logique, car, si vous vous rappelez de la logique sur les opérateurs, il est dans ce cas important de d'abord se concentrer sur l'âge : si la personne qui veut rentrer est trop jeune, qu'elle soit alcoolisée ou non, elle ne peut aps rentrer !

Et si vous compilez et exécuter ce code, voici ce que vous obtiendrez, d'abord en définissant la variable d'âge à 18 ans ou plus et celle l'alcoolisation à "false", puis en gardant la même valeur de variable d"âge mais en modifiant celle sur 'lalcoolisaiton à "true" et enfin, en fixant l'âge à en dessous de 18 ans, peu importe la variable d'alcoolisation :

![Exécution du fichier MacumbaFiesta, en prenant en compte deux variables](images/partie5/MacumbaFiestaAgeAlcool.png)

Ici, nous sommes dans les opérateurs logiques, avec l'opérateur `AND`, il faut que les deux variables, prises dans les expressions qu'on leur applique, soient vraies, soit avoir 18 ans et ne pas être alcoolisé. Et dans le cas présent, on s'assure avant toute chsoe que la personne est bien majeure.

Nous avons vu la logique générale. Voyons maintenant quelques particularités, comme le `else` seul à la suite d'une série de `if/else if`, ou alors de l'usage d'un `if` seul.

##### 2.1.1.1. Le `else` seul

Si vous avez fait du Java, ce qui est probable si vous suivez ce tuto, vous savez que souvent, une série de `if/else if`peut se terminer par un un `else` seul, sans conditon particulière. En réalité, il est là pour prendre en charge les cas de figure non prévus dans la chaîne de `if... else if`. Dans notre cas, nous avons explicitement prévu les ca soù la eprsonne est majeure et non alcolisée, les cas où elle est mineure et non alcolisée,e t celui où elle est majeure et alcolisée. C'est ce que nous avons défini de manière explicite. Cependant, il reste un cas de figure possible : celui où la eprsonne a bu et est mineure ! C'est ici que le `else` rentre en ligne de compte pour couvrir ce cas de figure :

```Java
public class MacumbaFiesta {

    public static void main(String[] args) {
        // Déclaration d'une variable d'âge et d'une variable sur la quantité d'alcool ingéré'
        int age = 18;
        boolean estAlcoolise = false;

        // Condition initiale pour rentrer au Macumba Fiesta
        if (age >= 18 && !estAlcoolise) {
            System.out.println("Bonsoir, vous pouvez franchir les portes du Macumba Fiesta !");
        }
        // Condition où la personne est majeure et alcoolisée
        else if (age >= 18 && estAlcoolise) {
            System.out.println("Ah je suis désolé, ça ne va pas le faire ! Revenez une prochaine fois !");
        }
        // Situation dans laquelle la personne n'est pas majeure et non alcoolisée
        else if (age < 18 && !estAlcoolise) {
            System.out.println("Désolé, t'as rien à faire ici, rentre chez toi !");
        }
        // Cas non explicitement défini où la personne est mineure et alcoolisée
        else {
            System.out.println("Tu es mineur et alcoolisé, c'est doublement non !");
        }
    }
}
```

Ici, ce cas est facile à déduire. Mais en général, le `else` va surtout vous servir dans les vas où les gens entre des valeurs inexploitalbes dans un système. Par exemple, si vous demandez un nombre entier positif et que la personne entre un nombre à virgule, un nombre éngatif ou une chaîne de caractères. Si votre algorithme prévoit tous les cas de figure où l'utilisateur entre les valeurs requises, le `else` va servir à afficher un message d'erreur en cas d'encodage de mauvaises valeurs, comme dans cet exemple :

```Java
public class InputValidation {
    public static void main(String[] args) {
        // Valeur encodée en dur
        int nombre = -5; // Vous pouvez changer cette valeur pour tester différentes situations
        
        System.out.println("La valeur encodée est : " + nombre);

        if (nombre > 0) {
            System.out.println("Vous avez entré un nombre positif : " + nombre);
        } else if (nombre == 0) {
            System.out.println("Erreur : Le nombre doit être supérieur à zéro.");
        } else {
            System.out.println("Erreur : Le nombre doit être positif.");
        }
    }
}
```

Ici, vous verrez que si vous rentrez une valeur sous zéro, ce sera traité par le `else` seul.



##### 2.1.1.2. Le `if` seul

Reste à parler du cas du `if` utilisé seul en début d'algorithme. Parfois, on peut empêcher l'exécutaion d'un long algorithme en vérifiant de manière préalable une condition unique qui, si elle n'est pas remplie, prévient l'exécution du reste de notre code. Reprenons notre code sur le Macumba Fiesta. En fait, il y a moyen de l'écrire autrement. Jusque là, je m'étais employé à voir si la personne était majeur ET non alcollisée. Une autre manière de procéder, plus simple, est tout simplement de d'abord vérifier l'âge : si la personne a en dessous de 18 ans, on n'exécute pas la suite du code, comme dans cet exemple :

```Java
public class MacumbaFiesta2 {

    public static void main(String[] args) {
        // Déclaration d'une variable d'âge et d'une variable sur la quantité d'alcool ingéré
        int age = 1è; // Vous pouvez changer cette valeur pour tester différentes situations
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
```

Le mot-clé ici qui doit vous intéresser ici est **return;** qui sert à marquer le fait qu'on arrête l'exécution du code et qu'on ne passe pas à la suite. Traduit dans la vie de tous les jours, si la personne a moins de 18 ans, ce n'est même pas la peine pour vérifer si elle est alcoolisée ou non. C'est seulement si ctte condition se vérifie que le reste du code s'exécute, avec la seconde structure conditionnelle. Regardez d'ailleurs concrètement ce que ça donne :

![Exécution du fichier MacumbaFiesta, avec une condition préalable](images/partie5/MacumbaFiestaConditionPrealable.png)

La seule ligne affichée est celle concernée par le "if" isolé : si l'âge avait été bon, le programme n'aurait pas affiché ce emssage et serait passé au suivant. ici, vu que la condition d'âge n'était pas remplie, le programme a affiché le texte prévu pour ce cas, et n'est pas allé plus loin grâce à l'instruction **return**..

 Retenez bien ce `return`, il reviendra un peu plus tard pour les *Switch* !
