import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestConvoyeur {

    @Test
    @DisplayName("Test de l'ajout d'une forme provenant du stockage")
    public void TestStockageForme(){
        Tapis conv = new Tapis(new Cellule(1, 2),Cardinal.Nord,Cardinal.Sud);

        Forme f = new Forme(10);
        assertEquals(10, f.getIdentifiant()); //Forme contient bien l'id 10
        conv.stockerForme(f);
        assertEquals(f, conv.getStockage()); //Le stockage de conv contient bien f
        System.out.println("L'ajout de forme dans le stockage fonctionne");
        conv.ajouterForme();
        assertEquals(null, conv.getStockage()); //Stockage est vide
        assertEquals(f, conv.getForme()); //La forme est f
        System.out.println("L'ajout de forme dans un convoyeur depuis le stockage fonctionne");
        Forme f2 = new Forme(11);
        conv.stockerForme(f2);
        assertEquals(f2, conv.getStockage()); //Verification que le stockage contiens bien f2
        assertEquals(f, conv.getForme()); // et que la forme courrante est f
    }

    @Test
    @DisplayName("Test de passage d'une forme d'un convoyeur à un autre")
    public void TestTransportForme(){
        Tapis conv1 = new Tapis(new Cellule(1, 0),Cardinal.Nord, Cardinal.Est);
        Tapis conv2 = new Tapis(new Cellule(2, 0),Cardinal.Est,Cardinal.Sud);
        Forme f = new Forme(10);

        conv1.stockerForme(f);
        conv1.ajouterForme();
        conv1.deplacerForme();
        assertNull(conv1.getForme());
        conv2.ajouterForme();
        assertEquals(f, conv2.getForme());
    }

    @Test
    @DisplayName("Test d'empechement de passage d'une forme d'un convoyeur à un autre")
    public void TestNonEcrasementForme(){
        Tapis conv1 = new Tapis(new Cellule(1, 0),Cardinal.Nord, Cardinal.Est);
        Tapis conv2 = new Tapis(new Cellule(2, 0),Cardinal.Est,Cardinal.Sud);
        Forme f = new Forme(10);
        Forme f2 = new Forme(11);

        conv1.stockerForme(f);
        conv1.ajouterForme();

        conv2.stockerForme(f2);
        conv2.ajouterForme();

        conv1.deplacerForme();
        assertEquals(f, conv1.getForme()); // Les formes reste inchangées
        assertEquals(f2, conv2.getForme());
    }

    @Test
    @DisplayName("Test d'empechement de passage d'une forme d'un convoyeur à un autre")
    public void TestDeplacementForme(){
        Tapis conv1 = new Tapis(new Cellule(1, 0),Cardinal.Nord, Cardinal.Est);
        Tapis conv2 = new Tapis(new Cellule(2, 0),Cardinal.Est,Cardinal.Sud);
        Forme f = new Forme(10);
        Forme f2 = new Forme(11);

        conv1.stockerForme(f);
        conv1.ajouterForme();
        assertEquals(f, conv1.getForme());
        conv2.stockerForme(f2);
        conv2.ajouterForme();
        assertEquals(f, conv2.getForme());
        conv2.extraireForme();
        conv1.deplacerForme();
        assertNull(conv1.getForme());
        assertEquals(f, conv2.getForme());
        // Test pour un convoyeur sans sortie
        Tapis conv3 = new Tapis(new Cellule(3, 0),Cardinal.Est,Cardinal.Sud);
        conv3.stockerForme(f);
        conv3.ajouterForme();
        assertEquals(f, conv3.getForme());
        conv3.deplacerForme();
        assertEquals(f, conv3.getForme());
    }

    @Test
    @DisplayName("Test des destinations de quatres convoyeurs placés sur les cases indiquées")
    public void TestDestinationConvoyeur(){
        // Tapis est un convoyeur
        Cellule c1 = new Cellule(0, 0);
        Cellule c2 = new Cellule(0, 1);
        Cellule c3 = new Cellule(1,0);
        Cellule c4 = new Cellule(1,1);
        Tapis t1 = new Tapis(c1, Cardinal.Nord, Cardinal.Sud);
        Tapis t2 = new Tapis(c2, Cardinal.Est, Cardinal.Sud);
        Tapis t3 = new Tapis(c3, Cardinal.Est, Cardinal.Ouest);
        Tapis t4 = new Tapis(c4, Cardinal.Est, Cardinal.Ouest);
        assertEquals(t3, t1.destination());
        assertEquals(null, t2.destination());
        assertEquals(t4, t3.destination());
        assertEquals(null, t4.destination());

        // == Changement de destination ==
        CelluleOriente[] newSortie = new CelluleOriente[] {
            new CelluleOriente(Cardinal.Est, c1)
        };
        t1.setSorties(newSortie);
        assertEquals(t2, t1.destination());
        // Vérification des destinations de trois convoyeurs placés surccéssivement
        Grille grille = Grille.getGrille(5, 5);
        Cellule cBis1 = new Cellule(0, 4);
        Cellule cBis2 = new Cellule(1, 4);
        Cellule cBis3 = new Cellule(2,4);
        Tapis tBis1 = new Tapis(cBis1, Cardinal.Ouest, Cardinal.Est);
        Tapis tBis2 = new Tapis(cBis2, Cardinal.Ouest, Cardinal.Est);
        Tapis tBis3 = new Tapis(cBis3, Cardinal.Ouest, Cardinal.Est);
        assertEquals(tBis2, tBis1.destination());
        assertEquals(tBis3, tBis2.destination());
        assertEquals(null, tBis3.destination());
        Forme f1 = new Forme(10);
        Forme f3 = new Forme(11);
        tBis1.stockerForme(f1);
        tBis1.ajouterForme();
        tBis3.stockerForme(f3);
        tBis3.ajouterForme();
        grille.update();
        assertEquals(f1,tBis2.getForme());
        assertEquals(f3, tBis3.getForme());
    }

}
