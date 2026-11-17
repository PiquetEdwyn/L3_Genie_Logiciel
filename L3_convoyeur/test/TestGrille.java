package L3_convoyeur.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

class GrilleTest {
    private Grille grille;
    @BeforeEach
    void setUp() {
        grille = new Grille();
    }
    // Test 1 : Vérifier que la grille existe
    @Test
    void testCreationGrille() {
        assertNotNull(grille);
    }
    // Test 2 : Vérifier plusieurs appels à update
    @Test
    void testUpdatePlusieursFois() {
        assertDoesNotThrow(() -> {
            grille.update();
            grille.update();
            grille.update();
        });
    }
}
