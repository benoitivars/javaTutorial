public class ComparateursRelationnels {
    public static void main(String[] args) {
        // Comparaison entre short et double
        short a = 10;
        double b = 10.5;
        boolean result1 = a < b; // true, car 'a' est converti en double avant la comparaison
        System.out.println("a < b: " + result1); // Affiche true

        // Comparaison entre int et float
        int x = 5;
        float y = 5.0f;
        boolean result2 = x == y; // true, car 'x' est converti en float avant la comparaison
        System.out.println("x == y: " + result2); // Affiche true

        // Comparaison entre long et int
        long m = 100L;
        int n = 100;
        boolean result3 = m >= n; // true, car 'n' est converti en long avant la comparaison
        System.out.println("m >= n: " + result3); // Affiche true

        // Comparaison de boolean
        boolean bool1 = true;
        boolean bool2 = false;
        boolean result4 = bool1 != bool2; // true, car 'true' n'est pas égal à 'false'
        System.out.println("bool1 != bool2: " + result4); // Affiche true

        // Comparaison de char
        char c1 = 'A';
        char c2 = 'B';
        boolean result5 = c1 < c2; // true, car 'A' est considéré comme plus petit que 'B'
        System.out.println("c1 < c2: " + result5); // Affiche true

        // Comparaison avec différents opérateurs relationnels
        System.out.println("30 > 20: " + (30 > 20)); // true
        System.out.println("30 < 20: " + (30 < 20)); // false
        System.out.println("30 >= 20: " + (30 >= 20)); // true
        System.out.println("30 <= 20: " + (30 <= 20)); // false
        System.out.println("30 == 20: " + (30 == 20)); // false
        System.out.println("30 != 20: " + (30 != 20)); // true

        // Comparaison entre double et int
        double d = 15.5;
        int i = 15;
        boolean result6 = d > i; // true, car 'i' est converti en double avant la comparaison
        System.out.println("d > i: " + result6); // Affiche true

        // Comparaison entre float et long
        float f = 20.0f;
        long l = 20L;
        boolean result7 = f == l; // true, car 'l' est converti en float avant la comparaison
        System.out.println("f == l: " + result7); // Affiche true

        // Comparaison entre byte et short
        byte bt = 10;
        short st = 10;
        boolean result8 = bt <= st; // true, car 'bt' est converti en short avant la comparaison
        System.out.println("bt <= st: " + result8); // Affiche true
    }
}