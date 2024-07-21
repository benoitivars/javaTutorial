public class ComparateursLogiques {
    public static void main(String[] args) {
        // ET logique (&& et &)
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // Utilisation de &&
        System.out.println("a && b : " + (a && b)); // false
        System.out.println("a && c : " + (a && c)); // true

        // Utilisation de &
        System.out.println("a & b : " + (a & b)); // false
        System.out.println("a & c : " + (a & c)); // true

        // OU logique (|| et |)
        // Utilisation de ||
        System.out.println("a || b : " + (a || b)); // true
        System.out.println("b || b : " + (b || b)); // false

        // Utilisation de |
        System.out.println("a | b : " + (a | b)); // true
        System.out.println("b | b : " + (b | b)); // false

        // OU exclusif (^)
        System.out.println("a ^ b : " + (a ^ b)); // true
        System.out.println("a ^ c : " + (a ^ c)); // false

        // NON logique (!)
        System.out.println("!a : " + (!a)); // false
        System.out.println("!b : " + (!b)); // true

        // Exemples combinés
        System.out.println("(a && b) || c : " + ((a && b) || c)); // true
        System.out.println("!(a && c) : " + (!(a && c))); // false

        // Exemple de vérification de badges (Pokémon)
        boolean aBadge1 = true;
        boolean aBadge2 = true;
        boolean aBadge3 = false;
        boolean peutCombattreLigue = aBadge1 && aBadge2 && aBadge3;
        System.out.println("Peut combattre la Ligue Pokémon : " + peutCombattreLigue); // false

        // Exemple de menu au restaurant (OU exclusif)
        boolean aChoisiEntree = true;
        boolean aChoisiDessert = false;
        boolean choixMenuValide = aChoisiEntree ^ aChoisiDessert;
        System.out.println("Choix de menu valide : " + choixMenuValide); // true

        // Exemple de VIP (OU inclusif)
        boolean aInvitation = true;
        boolean estVIP = false;
        boolean peutEntrerSoiree = aInvitation || estVIP;
        System.out.println("Peut entrer à la soirée : " + peutEntrerSoiree); // true
    }
}