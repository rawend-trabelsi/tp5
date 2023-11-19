package tp5_héritage_interface;

public abstract class Proprité {
    protected int id;
    protected Personne Responsable;
    protected String adresse;
    protected double surface;

    Proprité(int id, Personne Responsable, String adresse, double surface) {
        this.id = id;
        this.Responsable = Responsable;
        this.adresse = adresse;
        this.surface = surface;
    }

    @Override
    public String toString() {
        return "Proprité [id=" + id + ", Responsable=" + Responsable + ", adresse=" + adresse + ", surface=" + surface + "]";
    }

    abstract double calculImpot();
}
