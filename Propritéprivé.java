package tp5_héritage_interface;

public class Propritéprivé extends Proprité {
    private int nbpieces;

    Propritéprivé(int id, Personne Responsable, String adresse, double surface, int nbpieces) {
        super(id, Responsable, adresse, surface);
        this.nbpieces = nbpieces;
    }

    public int getNbpieces() {
        return nbpieces;
    }

    public void setNbpieces(int nbpieces) {
        this.nbpieces = nbpieces;
    }

    @Override
    double calculImpot() {

        if (nbpieces != 0) {
            return 0.5 * surface + 10.0 / nbpieces;
        } else {
            
            return 0; 
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Propritéprivé [nbpieces=" + nbpieces + "]";
    }
}
