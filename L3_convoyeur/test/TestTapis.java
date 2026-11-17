package L3_convoyeur.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

 class TestTapis{
    private :
        CelluleOriente[1] entrees;
        CelluleOriente[1] sorties;
        Tapis tapis ;
    @BeforeEach
        void SetUp(){
            entrees = new Tapis();
        }
    // Test 1 : Vérifier que la Tapis existe
    @Test
    void testCreationTapis() {
        assertNotNull(entree);
    }





 }







class TapisTest {

    private Tapis tapis;

    @BeforeEach
    void setUp() {
        // Initialisation du tapis
        // À compléter selon le constructeur réel
    }

    @Test
    void creationTapis() {
        assertNotNull(tapis);
    }

    @Test
    void entreeLibre() {
        // Vérifier que l'entrée est libre
    }

    @Test
    void sortieLibre() {
        // Vérifier que la sortie est libre
    }

    @Test
    void entreeOccupee() {
        // Vérifier le comportement
        // lorsque l'entrée est occupée
    }

    @Test
    void sortieOccupee() {
        // Vérifier le comportement
        // lorsque la sortie est occupée
    }

    @Test
    void transfertForme() {
        // Vérifier le transfert d'une forme
    }

    @Test
    void blocageTapis() {
        // Vérifier le blocage du tapis
    }

    @Test
    void repriseTransfert() {
        // Vérifier la reprise après blocage
    }

    @Test
    void conservationForme() {
        // Vérifier qu'aucune forme n'est perdue
    }

    @Test
    void absenceDuplication() {
        // Vérifier qu'aucune forme n'est dupliquée
    }
}