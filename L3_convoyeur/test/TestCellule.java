package test;

import src.Cardinal;
import src.Cellule;
import src.Grille;
import src.Tapis;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCellule {
    Grille g = Grille.getGrille(3, 3);

    @Test 
    @DisplayName("Test de l'attribut case")
    public void TestCase(){
        Cellule sujet = g.getGrille()[1][2];
        sujet = new Cellule(1, 2);
        assertTrue(sujet.est_libre());
        System.out.println("sujet.estLibre() is true");
        Tapis tapis = new Tapis(sujet,Cardinal.Nord,Cardinal.Sud);
        sujet.setConvoyeur(tapis);
        assertTrue(!sujet.est_libre());
        System.out.println("sujet.estLibre() is false");
    }
}
