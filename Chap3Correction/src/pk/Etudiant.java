package pk;

import java.sql.SQLException;

public class Etudiant extends Personne {
	private String cne;
	
	
	
	
	
	public Etudiant(String nom, String prenom, int age, String cne) {
		super(nom, prenom, age);
		this.cne = cne;
	}





	public String toString() {
		return super.toString()+ " "+ cne;
	}
	
	
	
	public void afficherInfo() {
		System.out.println(this.toString());
	}
	
	
}
