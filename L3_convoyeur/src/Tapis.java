package src;

public class Tapis extends Convoyeur {
    private CelluleOriente[] entrees;
    private CelluleOriente[] sorties;


    Tapis(Cellule cellule, Direction cardinalentree, Direction cardinalsortie) {
        if (cellule.est_libre() == false) {
            System.err.println("La cellule n'est pas libre !");
            return;
        }

        this.entrees = new CelluleOriente[] {
            new CelluleOriente(cardinalentree, cellule)
        };

        this.sorties = new CelluleOriente[] {
            new CelluleOriente(cardinalsortie, cellule)
        };
    }

    public CelluleOriente[] getEntrees() {
        return entrees;
    }

    public void setEntrees(CelluleOriente[] newEntrees) {
        this.entrees = newEntrees;
    }

    public CelluleOriente[] getSorties() {
        return sorties;
    }

    public void setSorties(CelluleOriente[] newSorties) {
        this.entrees = newSorties;
    }
}
