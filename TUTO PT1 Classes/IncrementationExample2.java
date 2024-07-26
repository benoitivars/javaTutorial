public class IncrementationExample2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int resultat = x++ + ++y;
        
        System.out.println("x = " + x); // x = 6
        System.out.println("y = " + y); // y = 11
        System.out.println("resultat = " + resultat); // result = 5 + 11 = 16
    }
}