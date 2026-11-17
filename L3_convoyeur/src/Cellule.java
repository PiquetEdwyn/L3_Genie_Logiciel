package src;

public class Cellule {
    private Convoyeur convoyeur;

    public boolean est_libre() {
        return convoyeur == null; // if convoyeur est null (donc que la case est libre car aucune convoyeur dessus) return true, sinon return false
    }

    public void setConvoyeur(Convoyeur new_convoyeur) {
        this.convoyeur = new_convoyeur;
    }

    public Convoyeur getConvoyeur() {
        return convoyeur;
    }

    public String toString() {
        return ("Je suis une cellule et ma liberté est : " + this.est_libre());
    }
}
