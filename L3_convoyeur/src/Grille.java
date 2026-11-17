package src;
import java.util.ArrayList;

public class Grille {
    private static Grille instance;
    private Cellule[][] grille;

    private Grille(int x, int y) {
        this.grille = new Cellule[x][y];
    }

    public static Grille getGrille(int x, int y) {
        if (instance == null) {
            instance = new Grille(x, y);
        }
        return instance;
    }

    public Convoyeur[] getConvoyeurs() {
        ArrayList<Convoyeur> convoyeurs = new ArrayList<>();
        for (int x = 0; x < grille.length; x++) {
            for (int y = 0; y < grille[x].length; y++) {
                if (grille[x][y] != null) {
                    if (grille[x][y].getConvoyeur() != null) {
                        convoyeurs.add(grille[x][y].getConvoyeur());
                    }
                }
            }
        }
        return convoyeurs.toArray(new Convoyeur[0]);
    }

    public Convoyeur getConvoyeur(int pos_x, int pos_y) {
        return grille[pos_x][pos_y].getConvoyeur();
    }

    public void update() {
        Convoyeur[] convoyeurs = getConvoyeurs(); 
        for (Convoyeur convoyeur : convoyeurs) {
            if (!convoyeur.estDisponible()) {

            }
        }
        return;
    }
}