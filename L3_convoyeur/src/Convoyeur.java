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
    public ArrayList<Oberserver> getOberserver()
    {
        return  this.observer;
    }
    
    /*
        estDisponible() : renvoie un boolean
    */
    public boolean estDisponible()
    {
        return !(this.forme == null);
    }

    /*
        destination() : renvoie la machine suivante
    */
    public Machine destination()
    {
        return 
    }

    /*
    
    */
    public void deplacerForme()
    {

    }

    /*
        extraireForme() : deplace la forme stocker dans 
            le conveyeur vers la variable `forme`
    */
    public void extraireForme()
    {
        this.forme = this.stockage;
        this.stockage = null;
    }
    /*
        stockerForme() : Stocke la forme placer en parametre 
            dans le conyeur
        @Param : Forme f
    */
    public void stockerForme(Forme f)
    {
        this.stockage = f;
    }

    /*
    
    */
    public void ajouterForme()
    {
        this.fomre = this.stockage
        this.stockage = null;
    }

    /*
    
    */
   public Cellule emplacement()
   {

   }
}
