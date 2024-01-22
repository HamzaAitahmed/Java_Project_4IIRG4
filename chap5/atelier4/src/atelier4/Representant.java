package atelier4;

public class Representant  extends Employée{
	
	private double CA;
	
	public Representant (String nom, String prenom, int age, String date, double cA) {
		super(nom, prenom, age, date);
		CA = cA;
	}

	public double calculerSalaire() {
		return (CA*0.2)+800;
	}

}
