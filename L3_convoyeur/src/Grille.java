package src;

public class Grille {
    private Cellule[][] grille;
    private Convoyeur[] convoyeurs;

    public Convoyeur[] getConvoyeurs() {
        int z = 0;
        int x = 0;
        int y = 0;
        while ((grille[x][y]) != null) {
            while ((grille[x][y]) != null) {
                if ((grille[x][y].getConvoyeur()) != null) {
                    convoyeurs[z] = grille[x][y].getConvoyeur();
                    z++;
                }
            }
            y = 0;
        }
        return convoyeurs;
    }


    public void update() {
        for (Convoyeur convoyeur : convoyeurs) {
            if (!convoyeur.estDisponible()) {
                
            }
        }
        return;
    }
}