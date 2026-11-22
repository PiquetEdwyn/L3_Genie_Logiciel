import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

public class TestDestinationUpdate {

    @Test
    @DisplayName("Test déplacement des formes avec update")
    public void testDestinationUpdate() {

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

        Forme f1 = new Forme(1);
        Forme f3 = new Forme(3);

        System.out.println("Début du test");

        c1.stockerForme(f1);
        c1.ajouterForme();

        c3.stockerForme(f3);
        c3.ajouterForme();

        assertSame(f1, c1.getForme());
        assertNull(c2.getForme());
        assertSame(f3, c3.getForme());

        System.out.println("Formes ajoutées sur C1 et C3");

        grille.update();
        System.out.println("Mise à jour de la grille");

        assertNull(c1.getForme());
        System.out.println("C1 est vide");

        assertSame(f1, c2.getForme());
        System.out.println("C2 contient f1");

        assertSame(f3, c3.getForme());
        System.out.println("C3 contient toujours f3");

        System.out.println("Fin du test");
    }
}