package tp5_héritage_interface;

public class Personne {
	private int cin ;
	private String prenom;
	private String nom;
	Personne ( int cin,String prenom,String nom)
	{
		this.cin=cin;
		this.prenom=prenom;
		this.nom=nom;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Personne [cin=" + cin + ", prenom=" + prenom + ", nom=" + nom + "]";
	}
	

}
