package src;

public class Cellule {
    private int x;
    private int y;
    private Convoyeur convoyeur;

    Cellule(int pos_x, int pos_y) {
        this.x = pos_x;
        this.y = pos_y;
        this.convoyeur = null;
    }

    public boolean est_libre() {
        return convoyeur == null; // if convoyeur est null (donc que la case est libre car aucune convoyeur dessus) return true, sinon return false
    }

    public void setConvoyeur(Convoyeur new_convoyeur) {
        this.convoyeur = new_convoyeur;
    }

    public Convoyeur getConvoyeur() {
        return convoyeur;
    }

    public int getX(){
        return x;
    }

    public void setX(int new_x){
        this.x = new_x;
    }

    public int getY(){
        return y;
    }

    public void setY(int new_y){
        this.y = new_y;
    }

    public String toString() {
        return ("Je suis une cellule et ma liberté est : " + this.est_libre());
    }
}
