package correction;

public class Ouvrier extends Employe{
	private int unite;

	public Ouvrier(String nom, String prenom, int date, int age, int unite) {
		super(nom, prenom, date, age);
		this.unite = unite;
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return  unite*5;
	}
	
}
