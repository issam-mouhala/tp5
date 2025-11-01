package ex2;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("=== Test 1 : Calcul normal ===");
            RacinCaree r1 = new RacinCaree(1, 4);
            afficherResultats(r1.resultat);

            System.out.println("\n=== Test 2 : Un seul nombre ===");
            RacinCaree r2 = new RacinCaree(4, 4);
            afficherResultats(r2.resultat);

            System.out.println("\n=== Test 3 : Racines de 0 à 10 ===");
            RacinCaree r3 = new RacinCaree(0, 10);
            afficherResultats(r3.resultat);

            System.out.println("\n=== Test 4 : Erreur (A > B) ===");
            new RacinCaree(5, 4);

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur détectée : " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void afficherResultats(double[] resultats) {
        for (int i = 0; i < resultats.length; i++) {
            System.out.printf("Racine(%d) = %.3f%n", i, resultats[i]);
        }
    }
}
