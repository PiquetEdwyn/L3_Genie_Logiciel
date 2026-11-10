package test;

import src.Cellule;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCellule {
    Cellule sujet = new Cellule();
    Grille[][] grille = new Grille[3][3];

    @Test 
    @DisplayName("Test de l'attribut case")
    public void TestCase(){
        assertTrue(sujet.estLibre());
        System.out.println("sujet.estLibre() is true");
        grille[1][2] = sujet;
        assertTrue(!sujet.estLibre());
        System.out.println("sujet.estLibre() is false");
    }
}
