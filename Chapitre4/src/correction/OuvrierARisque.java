package correction;

public class OuvrierARisque extends Ouvrier implements EmployeARisque{

	public OuvrierARisque(String nom, String prenom, int date, int age, int unite) {
		super(nom, prenom, date, age, unite);
	}
	
	public double calculerSalaire() {
		return super.calculerSalaire() + PRIME;
	}
	
}
