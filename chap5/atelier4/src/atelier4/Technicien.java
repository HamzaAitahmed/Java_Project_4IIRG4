package atelier4;

public class Technicien extends Employée{
	private int UP;
	
	public Technicien(String nom, String prenom, int age, String date, int uP) {
		super(nom, prenom, age, date);
		UP= uP;
	}

	public double calculerSalaire() {
		return UP*5;
	}
}
