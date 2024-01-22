package atelier4;

public class Manutentionnaire extends Employée{
	
	private int NH;

	public Manutentionnaire(String nom, String prenom, int age, String date,int nH) {
		super(nom, prenom, age, date);
	}
	
	public double calculerSalaire() {
		return NH*65;
	}
}
