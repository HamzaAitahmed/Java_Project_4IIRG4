package correction;

public class ManutentionARisque extends Manutention implements EmployeARisque{

	public ManutentionARisque(String nom, String prenom, int date, int age, int nbT) {
		super(nom, prenom, date, age, nbT);
	}
	public double calculerSalaire() {
		return super.calculerSalaire() + PRIME;
	}
	
}
