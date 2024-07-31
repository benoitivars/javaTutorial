public class HelloUniverse {
    public static void main(String... args){
        int nbPlanetes=9;
        int annee=2003;
        String phrase="En " +annee+", les planètes du système solaire étaient au nombre de : ";
        if (annee < 2006) {
        
            System.out.println(phrase+nbPlanetes);
            }
        else if (annee >= 2006) {
            --nbPlanetes;
            System.out.println(phrase+nbPlanetes);
            }
    }
}