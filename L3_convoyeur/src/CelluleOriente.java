package src;

public class CelluleOriente {
    private Cardinal direction;
    private Cellule cellule;

    CelluleOriente(Cardinal direction, Cellule cellule) {
        this.direction = direction;
        this.cellule = cellule;
    }

    public Cardinal getCardinal() {
        return this.direction;
    }

    public Cellule getCase() {
        return this.cellule;
    }

    public void setDirection(Cardinal new_direction) {
        this.direction = new_direction;
    }

    public void setCase(Cellule new_cellule) {
        this.cellule = new_cellule;
    }

    public String toString() {
        return ("Je suis une Cellule Orientée donc la cellule est : " + this.cellule + " et ma direction est : " + this.direction);
    }
}