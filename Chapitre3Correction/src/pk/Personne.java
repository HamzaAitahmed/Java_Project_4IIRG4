package pk;

public class Personne {
	private String nom="Filali";
	private String prenom="Ahmed";
	private String cin="SD3456";
	
	
	@Override
	public String toString() {
		return  "nom: "+nom +",prenom: "+prenom+", cin: "+cin;
	}


	public Personne(String nom, String prenom, String cin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
	}
	
	
	


	public void afficherInfo() {
		System.out.println(this.toString());
	}
	
	
	

}
