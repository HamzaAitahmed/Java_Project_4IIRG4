package atelier4;

public class TechnARisque  extends Technicien implements ARisque  {

	public TechnARisque(String nom, String prenom, int age, String date, int uP) {
		super(nom, prenom, age, date, uP);
	}
	
	public double calculerSalaire(){
		
   return super.calculerSalaire()+PRIME;
   }
}
