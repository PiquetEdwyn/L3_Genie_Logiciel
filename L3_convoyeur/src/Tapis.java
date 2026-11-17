package src;

public class Tapis extends Convoyeur {
    private CelluleOriente[] entrees = new CelluleOriente[1];
    private CelluleOriente[] sorties = new CelluleOriente[1];


    Tapis(Cellule cellule, Cardinal direction_entree, Cardinal direction_sortie) {
        if (cellule.est_libre() == false) {
            System.err.println("La cellule n'est pas libre !");
            return;
        }

        this.entrees = new CelluleOriente[] {
            new CelluleOriente(direction_entree, cellule)
        };

        this.sorties = new CelluleOriente[] {
            new CelluleOriente(direction_sortie, cellule)
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
