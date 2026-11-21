import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class TapisTest {

    // Test 1 : Vérifier la création du tapis
    @Test
    void testCreation() {

        Cellule cellule = new Cellule(5,5);

        Tapis tapis = new Tapis(cellule, Cardinal.Nord, Cardinal.Sud);

        // Vérifier que le tapis existe
        assertNotNull(tapis);
    }

    // Test 2 : Vérifier les entrées du tapis
    @Test
    void testEntrees() {

        Cellule cellule = new Cellule(5,5);
        Tapis tapis = new Tapis(cellule, Cardinal.Nord, Cardinal.Sud);

        // Vérifier que le tableau des entrées existe
        assertNotNull(tapis.getEntrees());

        // Vérifier qu'il y a exactement une entrée
        assertEquals(1, tapis.getEntrees().length);
    }

    // Test 3 : Vérifier les sorties du tapis
    @Test
    void testSorties() {

        Cellule cellule = new Cellule(5,5);
        Tapis tapis = new Tapis(cellule, Cardinal.Nord, Cardinal.Sud);

        // Vérifier que le tableau des sorties existe
        assertNotNull(tapis.getSorties());

        // Vérifier qu'il y a exactement une sortie
        assertEquals(1, tapis.getSorties().length);
    }

    // Test 4 : Vérifier le setter des entrées
    @Test
    void testSetEntrees() {

        Cellule cellule = new Cellule(5,5);
        Tapis tapis = new Tapis(cellule, Cardinal.Nord, Cardinal.Sud);

        CelluleOriente[] nouvellesEntrees = new CelluleOriente[1];

        // Modifier les entrées du tapis
        tapis.setEntrees(nouvellesEntrees);

        // Vérifier que les nouvelles entrées sont enregistrées
        assertSame(nouvellesEntrees, tapis.getEntrees());
    }

    // Test 5 : Vérifier le setter des sorties
    @Test
    void testSetSorties() {

        Cellule cellule = new Cellule(5,5);
        Tapis tapis = new Tapis(cellule, Cardinal.Nord, Cardinal.Sud);

        CelluleOriente[] nouvellesSorties = new CelluleOriente[1];

        // Modifier les sorties du tapis
        tapis.setSorties(nouvellesSorties);

        // Vérifier que les nouvelles sorties sont enregistrées
        assertSame(nouvellesSorties, tapis.getSorties());
    }
}
