package ex2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateurRacinesTest {

    @Test
    public void testCalculNormal() throws Exception {
        double[] resultats = new RacinCaree(1, 4).resultat;

        assertEquals(4, resultats.length);
        assertEquals(1.0, resultats[0], 0.001);  
        assertEquals(1.414, resultats[1], 0.001); 
        assertEquals(2.0, resultats[3], 0.001);  
    }

    @Test
    public void testAplusGrandQueB() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new RacinCaree(5, 4);
        });
        
        assertTrue(exception.getMessage().contains("A est plus grand ou egale B ??"));
    }

    @Test
    public void testUnSeulNombre() throws Exception {
        double[] resultats = new RacinCaree(4, 4).resultat;
        assertEquals(1, resultats.length, "Doit contenir un seul élément");
        assertEquals(2.0, resultats[0], 0.001);
    }

    @Test
    public void testRacinesPositives() throws Exception {
        double[] resultats = new RacinCaree(0, 10).resultat;
        for (double racine : resultats) {
            assertTrue(racine >= 0, "Toutes les racines doivent être positives");
        }
    }

    @Test
    public void testCarresParfaits() throws Exception {
        double[] resultats = new RacinCaree(1, 5).resultat;

        assertEquals(1.0, resultats[0], 0.0001);
        assertEquals(2.0, resultats[3], 0.0001);
    }
}
