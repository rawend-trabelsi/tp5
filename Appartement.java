package tp5_héritage_interface;

public class Appartement extends Propritéprivé{
	int numEtage;

	Appartement(int id, Personne Responsable, String adresse, double surface, int nbpiéces,int numEtage) {
		super(id, Responsable, adresse, surface, nbpiéces);
		{
			this.numEtage=numEtage;
		}
		
	}

	@Override
	public String toString() {
		return super.toString()+"Appartement [numEtage=" + numEtage + "]";
	}

}
