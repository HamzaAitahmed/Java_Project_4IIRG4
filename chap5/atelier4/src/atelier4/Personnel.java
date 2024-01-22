package atelier4;
import java.util.ArrayList;

public class Personnel {
	private ArrayList<Employée> employes= new ArrayList<Employée>();
	
	public void ajouterEmploye(Employée e) {
		employes.add(e);
	}
	public void afficherSalaires() {
		for(Employée employe:employes) {
			System.out.println(employe.getNom()+" - Salaire : " + employe.calculerSalaire()+" Francs");
		}
	}
	 public double salaireMoyen() {
	        double totalSalaire = 0;
	        for (Employée employe : employes) {
	            totalSalaire += employe.calculerSalaire();
	        }
	        return totalSalaire / employes.size();
	    }

}
