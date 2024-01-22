package Pk___1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class TableauDesEmployes {
	
		private Employe[] employes = new Employe[6];
		
		public void remplir() {
			employes[0]=new Employe("aboutani","aicha","AZR665",40000);
			employes[1]=new Employe("aitdadali","hassan","AHJ265",200000);
			employes[2]=new Employe("rizki","imane","AXN965",40000);
			employes[3]=new Employe("Lgdar","omar","AZR165",40500);
			employes[4]=new Employe("Bouslim","houssam","NBR665",450000);
		}

		public void trier(Comparator<Employe> cmp) {
			Arrays.sort(employes,cmp);
		}
		
		public double calculersalaires() {
			double somme=0;
			for(Employe emp:employes)
				somme+=emp.getSalaire();
			return somme;
		}
		
		public double calculerMoyenne() {
			return this.calculersalaires()/employes.length;
			
		}
		public boolean tester(Employe emp1){
			for (Employe emp:employes)
				if(emp.equals(emp1))
					return true;
			return false;
		}
		
		public boolean Supprimer(Employe emp) {
			if(!this.tester(emp)) return false;
			ArrayList<Employe> liste=new ArrayList<Employe>(Arrays.asList(employes));
			liste.remove(emp);
			employes=liste.toArray(new Employe[liste.size()]);
			return true;
		}
		
		public Employe[] copie(int start ,int end) {
			if(start>=0&&start<end)
			return Arrays.copyOfRange(employes, start, end);
		throw new IllegalArgumentException("probleme!!!!!");
		}
		

		
		public void afficherSalaireMaxMin()
		{
			Arrays.sort(employes, new CmpSalaire());
			
			System.out.println("le salaire max est:"+employes[employes.length-1].getSalaire()+"et le salaire min est"+employes[0].getSalaire());
		}
		
		
		public void inverser()
		{
			ArrayList<Employe>liste=new ArrayList<Employe>(Arrays.asList());
			Collections.reverse(liste);
			employes=liste.toArray(new Employe[liste.size()]);
			
		}
		
		public Employe EmplPlusGrandSalaire()
		{
			Arrays.sort(employes,new CmpSalaire());
			return employes[employes.length-1];
			
		}
		
		public boolean testerEgaliter(Employe[] tab)
		{
			return Arrays.equals(employes,tab);
		}
		
		public void afficher()
		{
			for(Employe emp:employes)
			{
				System.out.println(emp);
			}
		}
		

}	
		
		
				

		
		
