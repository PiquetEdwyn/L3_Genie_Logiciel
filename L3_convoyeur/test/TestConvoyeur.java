package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test.None;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import src.Cardinal;
import src.Cellule;
import src.Forme;
import src.Tapis;

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
    }
}
