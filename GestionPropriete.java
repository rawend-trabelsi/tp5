package tp5_héritage_interface;

public interface GestionPropriete {
	public static final int MAX_PROPRIETES = 0;
	void afficherPropriétés();
	boolean ajouter(Proprité p);
	boolean supprimer(Proprité p);
	
	
}
