public class BureauDeChange {
    public static void main(String[] args) {
        float tauxDeChange = 1.22f;
        short sommeEuros = 1500;
        float conversion = tauxDeChange*sommeEuros;
        System.out.println("La somme des euros convertie est de " + conversion + " dollars.");
    }
}
