package test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test.None;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestConvoyeur {

    @Test 
    @DisplayName("Test de l'ajout d'une forme provenant du stockage")
    public void TestStockageForme(){
        Convoyeur conv = new Convoyeur();

        Forme f = new Forme(10);
        assertEquals(10, f.getId()); //Forme contient bien l'id 10
        conv.stocker_forme(f); 
        assertEquals(f, conv.getStockage()); //Le stockage de conv contient bien f
        System.out.println("L'ajout de forme dans le stockage fonctionne");
        conv.ajouter_forme(); 
        assertEquals(null, conv.getStockage()); //Stockage est vide
        assertEquals(f, conv.getForme()); //La forme est f
        System.out.println("L'ajout de forme dans un convoyeur depuis le stockage fonctionne");
        Forme f2 = new Forme(11);
        conv.stocker_forme(f2);
        assertEquals(f2, conv.getStockage()); //Verification que le stockage contiens bien f2
        assertEquals(f, conv.getForme()); // et que la forme courrante est f
    }

    @Test 
    @DisplayName("Test de passage d'une forme d'un convoyeur à un autre")
    public void TestStockageForme()
}
