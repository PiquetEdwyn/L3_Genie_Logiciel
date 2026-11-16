package src;

public class CelluleOriente {
    private Direction cardinal;
    private Cellule cellule;

    CelluleOriente(Direction cardinal, Cellule cellule) {
        this.cardinal = cardinal;
        this.cellule = cellule;
    }

    public Direction getCardinal() {
        return this.cardinal;
    }

    public Cellule getCase() {
        return this.cellule;
    }

    public void setCardinal(Direction newCardinal) {
        this.cardinal = newCardinal;
    }

    public void setCase(Cellule newCellule) {
        this.cellule = newCellule;
    }

    public String toString() {
        return ("Je suis une Cellule Orientée donc la cellule est : " + this.cellule + " et ma direction est : " + this.cardinal);
    }
}