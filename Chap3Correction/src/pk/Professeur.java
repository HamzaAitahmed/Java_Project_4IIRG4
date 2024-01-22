package pk;

public class Professeur extends Personne{
	
	
	private String grade;
	private String etablissement;
	
	
	


	public Professeur(String nom, String prenom, int age, String grade, String etablissement) {
		super(nom, prenom, age);
		this.grade = grade;
		this.etablissement = etablissement;
	}



	@Override
	public String toString() {
		return  super.toString() + " grade=" + grade + ", etablissement=" + etablissement ;
	}
	
	
	
	public void afficherInfo() {
		System.out.println("Je suis professeur");
	}
	
	

}
