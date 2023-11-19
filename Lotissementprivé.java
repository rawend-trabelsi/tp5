package tp5_héritage_interface;

public class Lotissementprivé extends Lotissement {
	
	

	    Lotissementprivé(int capacite) {
		super(capacite);
		// TODO Auto-generated constructor stub
	}

	    @Override
	    public boolean ajouter(Proprité p) {
	        if (p instanceof Propritéprivé) {
	            return super.ajouter(p);
	        } else {
	            System.out.println("Erreur : Impossible d'ajouter une propriété qui n'est pas privée.");
	            return false;
	        }
	    }

	    public Propritéprivé getProprieteByIndice(int i) {
	        if (i >= 0 && i < nombre && tabProp[i] instanceof Propritéprivé) {
	            return (Propritéprivé) tabProp[i];
	        } else {
	            return null;
	        }
	    }

	    public int getNbPieces() {
	        int total = 0;
	        for (int i = 0; i < nombre; i++) {
	            if (tabProp[i] instanceof Propritéprivé) {
	                total += ((Propritéprivé) tabProp[i]).getNbpieces();
	            }
	        }
	        return total;
	    }

		@Override
		public void afficherPropriétés() {
			System.out.println();
			
		}
	}



