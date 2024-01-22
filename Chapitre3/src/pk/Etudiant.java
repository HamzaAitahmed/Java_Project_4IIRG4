package pk;

public class Etudiant extends Personne{
	private String ecole;
	
	public Etudiant(String nom, String prenom, String cin, String ecole) {
		super(nom,prenom,cin);
		this.ecole=ecole;
	}

	@Override
	public String toString() {
		return super.toString() + ", ecole=" + ecole;
	}
	
	

}
