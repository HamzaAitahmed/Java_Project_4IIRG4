package S4EX2;

public abstract class Personne {
	String nom;
	String prenom;
	String dateNaissance;
	public Personne(String nom, String prenom, String dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	
	public abstract void description();

	@Override
	public String toString() {
		return "[nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + "]";
	}
	
	
	
}
