package tp5_héritage_interface;

public class Villa extends Propritéprivé {
    boolean avecpicisine;

    Villa(int id, Personne Responsable, String adresse, double surface, int nbpieces, boolean avecpicisine) {
        super(id, Responsable, adresse, surface, nbpieces);
        this.avecpicisine = avecpicisine;
    }

    @Override
    public String toString() {
        return super.toString() + " Villa [avecpicisine=" + avecpicisine + "]";
    }

    @Override
    double calculImpot() {
        double montant = 0;
        if (this.avecpicisine) {
            montant = super.calculImpot() + 200;
        }
        return montant;
    }
}
