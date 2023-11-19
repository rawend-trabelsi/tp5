package tp5_héritage_interface;

public class Propriétéprofessionelle  extends Proprité {
	int nbEmployees;
	boolean estetatique;

	Propriétéprofessionelle(int id, Personne Responsable, String adresse, double surface, int nbEmployees, boolean estetatique) {
		super(id, Responsable, adresse, surface);
		this.nbEmployees=nbEmployees;
		this.estetatique=estetatique;
		
	}
	

	@Override
	double calculImpot() {
		if(estetatique=false)
		{
			return 100/100*surface +30/nbEmployees;
			
		}
		
		return 0;
	}
	

}
