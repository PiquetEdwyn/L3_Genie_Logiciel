import java.util.ArrayList;
import java.util.Observer;

public abstract class Convoyeur {

    // entrees la direction de l'entrees
    private CelluleOriente[] entrees;

    // sorties la direction de la sortie
    private CelluleOriente[] sorties;

    // forme est la forme transformer
    private Forme forme;

    // stockage est la forme garder dans la machine
    private Forme stockage;

    // observer est la liste des observeur
    private ArrayList<Observer> observer;

    // grille : singloton
    private Grille grille;

    /*
        Getter pour entrees
    */
    public CelluleOriente[] getEntrees()
    {
        return this.entrees;
    }
    /*
        Getter pour sorties
    */
    public CelluleOriente[] getSorties()
    {
        return this.sorties;
    }
    /*
        Getter pour forme
    */
    public Forme getForme()
    {
        return this.forme;
    }
    /*
        Getter pour forme
    */
    public Forme getStockage()
    {
        return this.stockage;
    }
    /*
        Getter pour Observer
    */
    public ArrayList<Observer> getOberserver()
    {
        return  this.observer;
    }



    /*
        estDisponible() : renvoie un boolean
    */
    public boolean estDisponible()
    {

        if(this.forme != null)
        {
            return false;
        }
        if(this.stockage != null)
        {
            return false;
        }
        return true;

    }

    /*
        destination() : renvoie la machine suivante
    */
    public Convoyeur destination(){
        if(this.sorties != null)
        {
            Cardinal direction = sorties[0].getCardinal();
            int x = sorties[0].getCase().getX();
            int y = sorties[0].getCase().getY();

            if(direction == Cardinal.Nord)
            {
                return this.grille.getConvoyeur(x+1,y);
            }
            if(direction == Cardinal.Sud)
            {
                return  this.grille.getConvoyeur(x,y-1);
            }
            if(direction == Cardinal.Ouest)
            {
                return  this.grille.getConvoyeur(x-1,y);
            }
            if(direction == Cardinal.Est)
            {
                return this.grille.getConvoyeur(x,y-1);
            }
        }
        return null;
    }
    /*
        deplacerForme() : transfert la forme f de la var forme vers le stockage de la suivante
            met a null la var forme
    */
    public void deplacerForme()
    {
        if(this.forme != null)
        {
            Forme f = getForme();
            Convoyeur des = destination();
            des.stockerForme(f);
            this.forme = null;
        }
    }

    /*
        extraireForme() : met a null la ver forme
    */
    public void extraireForme()
    {
        this.forme = null;
    }
    /*
        stockerForme() : Stocke la forme placer en parametre
            dans le conyeur
        @Param : Forme f
    */
    public void stockerForme(Forme f)
    {
        if(stockage == null)
        {
            this.stockage = f;
        }
    }

    /*
        ajouterForme() : Transfert la forme de la var stockage vers la var forme
            et met a null la var stockage
    */
    public void ajouterForme()
    {
        this.forme = this.stockage;
        this.stockage = null;
    }

    /*

    */
   public Cellule emplacement()
   {
        return null;
   }
}
