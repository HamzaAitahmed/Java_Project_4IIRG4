package atelier4;

public class ManutARisque extends Manutentionnaire implements ARisque{

	public ManutARisque(String nom, String prenom, int age, String date, int nH) {
		super(nom, prenom, age, date, nH);
		
	}
	
	public double calculerSalaire(){
		
		   return super.calculerSalaire()+PRIME;
		   }
		}


