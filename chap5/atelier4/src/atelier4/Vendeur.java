package atelier4;

public class Vendeur extends Employée {
	
	private double CA;

	

	public Vendeur(String nom, String prenom, int age, String date, double cA) {
		super(nom, prenom, age, date);
		CA = cA;
	}

	public double calculerSalaire() {
		return (CA*0.2)+400;
	}
	
}
