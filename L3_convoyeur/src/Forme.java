package src;

public class Forme {
    private int identifiant;

    public Forme(int id) {
        identifiant = id;
    }

    public int getIdentifiant() {
        return this.identifiant;
    }

    public void setIdentifiant(int new_identifiant) {
        this.identifiant = new_identifiant;
    }

    public String toString() {
        return ("Je suis une forme et mon identifiant est : " + this.identifiant);
    }
}