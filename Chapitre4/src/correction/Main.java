package correction;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static double salaireMoyen(List<Employe> employes) {
		
		double somme = 0; // variable locale;
		for(Employe emp: employes)
			somme+=emp.calculerSalaire();
		
		
		return somme/employes.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employe> liste = new ArrayList<Employe>();
		
		
		liste.add(new Commercial("tejda", "hicham", 2000, 21, 15000));
		liste.add(new Ouvrier("Nassik", "Othman", 2000, 21, 200));
		liste.add(new Manutention("Moqal", "Adam", 2000, 21, 40));
		liste.add(new OuvrierARisque("xxx", "yyy", 2000, 21, 200));
		liste.add(new ManutentionARisque("xxx", "yyy", 2000, 21, 200));
	liste.add(new Commercial("tejda", "hicham", 2000, 21, 20000));
		
		for(Employe emp: liste)
			emp.afficherNom();
		
		System.out.println("le salaire moyen est : " +salaireMoyen(liste));
		
		
		System.out.println("Les employes a risque");
		EmployeARisque [] employesARisque = new EmployeARisque [3];
		employesARisque [0] = new OuvrierARisque("xxx", "yyy", 2000, 21, 200);
		employesARisque [1] = new ManutentionARisque("xxx", "yyy", 2000, 21, 200);
		employesARisque [2] = new OuvrierARisque("tejda", "hicham", 2000, 21, 400);
		for(EmployeARisque emp: employesARisque)
			emp.afficherNom();

	
	}

}
