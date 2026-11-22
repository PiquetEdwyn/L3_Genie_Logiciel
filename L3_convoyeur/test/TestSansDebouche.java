import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

public class TestSansDebouche {

    @Test
    @DisplayName("Test Convoyeur sans débouché")
    public void testSansDebouche() {

        Grille grille = Grille.getGrille(3, 1);
        Cellule[][] cellules = grille.getGrille();

        cellules[0][0] = new Cellule(0, 0);
        cellules[1][0] = new Cellule(1, 0);
        cellules[2][0] = new Cellule(2, 0);

        Tapis tapis = new Tapis(cellules[0][0], Cardinal.Ouest, Cardinal.Est);
        cellules[0][0].setConvoyeur(tapis);

        Forme forme = new Forme(1);

        System.out.println("Début du test");

        tapis.stockerForme(forme);
        tapis.ajouterForme();

        assertSame(forme, tapis.getForme());
        System.out.println("Forme ajoutée au convoyeur");

        assertNull(tapis.destination());
        System.out.println("Le convoyeur n'a aucune destination");

        tapis.deplacerForme();
        System.out.println("Tentative de déplacement de la forme");

        assertSame(forme, tapis.getForme());
        System.out.println("La forme est toujours sur le convoyeur");

        System.out.println("Fin du test");
    }
}