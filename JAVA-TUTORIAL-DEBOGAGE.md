# Debuger le code Java sur VSCode

Je décide de faire un tuto annexe sur le débogage en Java depuis VSCode pour trois raisons très simples : 

- J'ai eu beaucoup de mal à le configurer et à le comprendre.
- Si j'ai rencontré ces difficultés, je pars du principe que je ne suis pas seul dans ce cas, et que quelques explications supplémentaires ne sont pas de trop.
- L'absence de ressources en français, actuelles, sur le débogage Java sur VSCode. Si d'un côté j'ai tout à fait conscience que la maîtrise de l'anglais technique est un indispensable du développement et que tôt ou tard il faut se résoudre à plonger dans ce grand bain; je me dis de l'autre côté que donner les ressources de base en français peut peut-être encourager un peu plus de monde à se lancer dans Java, et au moins donner quelques clés qui pourront ensuite être exploitées pour parfaire ses connaissances grâce à des ressources en anglais.

Mais avant d'attaquer les instructions de configuration à proprement parler, essayons de voir en quoi consiste le débogage, à quoi il sert, et à voir s'il intervient plutôt sur la **compilation** du code Java en Bytecode ou sur **l'exécution** par la Java Virtual Machine.

## 1. Rappel de la vision Java : "Code once, run everywhere"

Commençons par un rappel élémentaire, Java est un langage **complié**, c'est à dire qu'avant d'être exécuté, il est "traduit" dans un langage intermédiaire, le *Bytecode* (beaucoup plus proche du langage binaire que Java), qui  via la *Java Virtual Machine*, est exécuté par l'ordinateur. L'idée derrière cette exécution en deux temps est qu'une fois le code écrit et compilé, on peut l'exécuter sur tous les environements possibles, sans devoir le retoucher, l'exécution produisant toujours l'effet attendu.

C'est en se basant sur cette différence centrale entre ces deux étapes qu'on peut aborder la quesiton des erreurs qu'on peut rencontrer dans son code, en faisant la distinction entre els eurreurs **syntaxiques**, qui prennent place avant la compilation du code et les erreurs **logiques** qui elles arrivent à l'exécution, alors que le code en lui-même est bien écrit.

## 2. Les erreurs syntaxiques

Ce rappel fait, parlons maintenant des types d'erreurs que l'on peut faire quand on code en général : il y a d'une part les erreurs **syntaxiques** et de l'autre, les **erreurs logiques**. Les premières sont celles qui empêchent le code d'être compilé en Bytecode.  

Les erreurs **syntaxiques** qui apparaissent quand on a un code qui comporte des fautes d'orthographe dans le nom d'une variable, qu'on oublie une accolade dans le code, qu'on attribue un mauvais type de valeur à une variable donnée, qu'on oublie un `;` pour fermer une instruction, que dans une expression utilisant l'opérateur relationnel d'équivalence et qu'on écrit `=` au lieu de `==`, ... bref, toutes erreurs de non respect des conventions Java. Et quand on tente de faire tourner un code qui comprend de telles erreurs, la compilation échoue, la console de Git Bash ou celle incluse dans VSCode vous le signifiant, et indiquant même les lignes où il y a un problème. L'idée ici est que le compilateur n'arrive pas à faire son travail si le code n'est pas correctement écrit.

Par exemple, si vous lancez ce code :

```Java
public class SyntaxErrors {
    public static void main(String[] args {
        int number = 10
        System.out.println("Le nombre est : " + number);
        if (number = 10) {
            System.out.println("Le nombre est égal à 10");
        }
    }
}
```

Voilà ce que vous aurez dans la *console*, qui est l'endroit qui indique nos erreurs de **syntaxe** :

![Erreurs de syntaxe](images/debogage/SyntaxError.png)

Avec ici l'indication de deux erreurs, qui correspondent à ce que vous dit VSCode :

![Erreurs de syntaxe indiquées](images/debogage/SyntaxErrorCode.png)

Les commentaires Git Bash vous indiquent bien que, ligne 2, il manque une `)` pour clôturer la méthode "main" et à la ligne 3, un `;` pour clôturer l'instruction.

Et ces erreurs corrigées, Git Bash vous indiquera celle ligne 5.

Une fois les erreurs corrigées, vous verrez que ``SyntaxError.class`` est dans le dossier, c'est-à-dire que le compilateur a pu fonctionner car il n'y avait plus d'erreurs de *syntaxe* :

![Compilation réussie](images/debogage/SyntaxErrorCompilation.png)

Et là, votre code s'exécutera sans encombre.

## 3. Les erreurs logiques

C'est ici que les choses vont se complexifier quelque peu. Jusqu'à présent, les erreurs que nous faisons ne portaient pas forcément à conséquence, vu qu'elles empéchaient le code d'être compilé.

Cependant, il arrive souvent que l'on ait un code bien écrit sans faute grossière, qui se compile et qui s'exécute et... produit des erreurs. Qui peuvent avoir des conséquences si le code n'est pas bien débogué. Et parfois, ces erreurs peuvent avoir des conséquences assez lourdes, comme décollage d'Ariane 5 en 1996 qui a mené à une désintégration de la fusée suite à une erreur de conversion de données, ou bien plus récemment, avec la mise à jour d'un logiciel de la firme CrowdStrike le 19 juillet 2024, où un bug passé inaperçu, a mené à une paralyse de nombreux services publics et privés pendant de longues heures.

Dans ces cas, le code s'exécute correctement, il n'y a pas d'erreurs de *syntaxe*. En revanche, dans la gestion des variables, il y a des manipulations de valeurs qui donnent des résultats inattendus et potentiellement problématiques. Si vous suivez le tutoriel Java que j'ai écrit ou suis en train d'écrire, vous imaginez bien que, par exemple, un mauvais encodage ou traitement d'une variable booléenne en début de script dans le cas d'une structure conditionnelle qui arrête tout en début d'exécution peut mener à de grosses déconvenues. C'est ce que nous appelons les erreurs **logiques**, qui elles, ne sont pas détectées lors de la compilation et qui peuvent être bien plus pénibles à débusquer.

Voici un code syntaxiquement juste, mais qui contient une erreur logique :

```java
public class ExempleErreurLogique {
    public static void main(String[] args) {
        int nombre = 10;
        System.out.println("Le nombre a pour valeur " + nombre);
        boolean estPair = (nombre % 2 == 0);
        nombre++;

        if (estPair) {
            System.out.println("Le nombre " + nombre +  " est pair.");
        } else {
            System.out.println("Le nombre est " + nombre +  " impair.");
        }
    }
}
```

Si vous avez parcouru le tuto principal jusqu'aux différents types d'opérateurs, vous verrez bien, avec un peu de logique, que le modulo d'un nombre, le reste de la division euclidienne, doit être égal à zéro si le nombre divisé est pair. Or ici, on a mis comme condition que `estPair` est vrai si le modulo de `nombre` par deux est égal à zéro. Ensuite, on incrémente `nombre`, ce qui change sa valeur.

Et pourtant, quand on exécute le code, il tourne sans soucis, car il n'y a aucune erreur syntaxique :

![Le code est correctement compilé, mais l'erreur logique est évidente](images/debogage/ErreurLogique.png)

Mais d'un point de vue *logique*, ça ne va pas, car la variable `nombre` change subitement de valur !

C'est là qu'un outil de débogage peut être très utile, car il permet de voir au fur et à mesure que s'exécute le code la valeur que prend une variable donnée.

Et c'est là qu'on doit remettre les mains dans le cambouis pour configurer VSCode pour que le débogueur fonctionne !

## 4. Configurer le débogueur Java pour VSCode

### 4.1.1 Vérification des installations

Si vous avez suivi la première partie du tuto sur Java à laquelle ce tuto de débogage sert de complément, vous avez en principe installé toutes les extensions de VSCode nécessaires pour déboguer du code Java. 