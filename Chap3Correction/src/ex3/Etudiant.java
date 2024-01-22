package ex3;

public class Etudiant extends Personne{
	
		private String cne;
	
	public Etudiant(String nom, String prenom, String cin, int age, String cne) {
		super(nom, prenom, cin, age);
		this.cne =cne;
		// TODO Auto-generated constructor stub
	}
	public Etudiant() {
		super(null, null, null, 0);
		this.cne =null;
	}


	
	
	public String getCne() {
		return cne;
	}
	public void setCne(String cne) {
		this.cne = cne;
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("Cne : " + cne); 
	}
}
