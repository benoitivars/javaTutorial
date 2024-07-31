public class ExempleErreurLogique {
    public static void main(String[] args) {
        int nombre = 10;
        System.out.println("Le nombre a pour valeur " + nombre);
        boolean estPair = (nombre % 2 == 0);
        ++nombre;

        if (estPair) {
            System.out.println("Le nombre " + nombre +  " est pair.");
        } else {
            System.out.println("Le nombre est " + nombre +  " impair.");
        }
    }
}