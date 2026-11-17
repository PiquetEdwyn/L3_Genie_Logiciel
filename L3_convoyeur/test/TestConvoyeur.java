package test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test.None;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestConvoyeur {
    Convoyeur conv = new Convoyeur();

    @Test 
    @DisplayName("Test de l'ajout d'une forme provenant du stockage")
    public void TestStockageForme(){
        Forme f = new Forme(10);
        assertEquals(10, f.getId());
        conv.stocker_forme(f);
        assertEquals(10, conv.getStockage().getId());
        System.out.println("L'ajout de forme dans le stockage fonctionne");
        conv.ajouter_forme();
        assertEquals(null, conv.getStockage().getId());
        assertEquals(10, conv.getForme().getId());
        System.out.println("L'ajout de forme dans un convoyeur depuis le stockage fonctionne");
    }
}
