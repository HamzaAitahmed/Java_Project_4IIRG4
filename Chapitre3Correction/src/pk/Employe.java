package pk;

public class Employe extends Personne{
	private String matricule="123456789";
	private double salaire=15000;
	
	
	@Override
	public String toString() {
		return super.toString()+", matricule: "+matricule+", salaire: "+salaire;
	}


	public Employe(String nom, String prenom, String cin, String matricule, double salaire) {
		super(nom, prenom, cin);
		this.matricule = matricule;
		this.salaire = salaire;
	}
	
	
	public double calculerSalaireTotal() {
		return this.salaire*1.2;
		
	}
	
	
	

}
