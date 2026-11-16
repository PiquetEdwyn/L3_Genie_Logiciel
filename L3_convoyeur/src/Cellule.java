package src;

public class Cellule {
    private Machine machine;

    public boolean est_libre() {
        return machine == null; // if machine est null (donc que la case est libre car aucune machine dessus) return true, sinon return false
    }

    public void setMachine(Machine newMachine) {
        this.machine = newMachine;
    }

    public Machine getMachine() {
        return machine;
    }

    public String toString() {
        return ("Je suis une cellule et ma liberté est : " + this.est_libre());
    }
}
