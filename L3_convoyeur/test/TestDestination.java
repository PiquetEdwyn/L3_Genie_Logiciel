import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

public class TestDestination {

    @Test
    @DisplayName("Test destination de trois convoyeurs")
    public void testDestination() {

        Grille grille = Grille.getGrille(3, 1);
        Cellule[][] cellules = grille.getGrille();

        cellules[0][0] = new Cellule(0, 0);
        cellules[1][0] = new Cellule(1, 0);
        cellules[2][0] = new Cellule(2, 0);

        Tapis c1 = new Tapis(cellules[0][0], Cardinal.Ouest, Cardinal.Est);
        Tapis c2 = new Tapis(cellules[1][0], Cardinal.Ouest, Cardinal.Sud);
        Tapis c3 = new Tapis(cellules[2][0], Cardinal.Est, Cardinal.Ouest);

        cellules[0][0].setConvoyeur(c1);
        cellules[1][0].setConvoyeur(c2);
        cellules[2][0].setConvoyeur(c3);

        System.out.println("Début du test");

        assertSame(c2, c1.destination());
        System.out.println("C1 a bien C2 comme destination");

        assertNull(c3.destination());
        System.out.println("C3 n'a aucune destination compatible");

        System.out.println("Fin du test");
    }
}