package PK1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class EmployeArray {

	private Employe[] employes = new Employe[3];

	public EmployeArray() {
		employes[0]=new Employe(null, null);
		employes[1]=new Serveur(null, null,null);
		employes[2]=new Employe(null, null);

		
	}
	
	public void trier(Comparator<Employe> emp) {
		Arrays.sort(employes,emp);
	}
	
	public void ajouteEmploye(Employe e) {
		Employe[] employes_2 = Arrays.copyOf(employes, employes.length+1);
		employes_2[employes.length] = e;
	}
	
	
	public boolean supprimerEmploye(Employe emp) {
		ArrayList<Employe> liste=new ArrayList<Employe>(Arrays.asList(employes));
		liste.remove(emp);
		employes=liste.toArray(new Employe[liste.size()]);
		return true;
	}

	public int nombreDesEmploye() {
		return employes.length;
	}
	
	public void inverser()
	{
		ArrayList<Employe>liste=new ArrayList<Employe>(Arrays.asList(employes));
		Collections.reverse(liste);
		employes=liste.toArray(new Employe[liste.size()]);
		
	}
	
	public void afficherLesEmploye()
	{
		for(Employe emp : employes)
		{
			emp.toString();
			//System.out.println(emp);
		}
	}
	
	public Employe grandEmploye()
	{
		Employe grandEmploye = employes[0];
		for(int i =0 ; i < employes.length-1 ; i++)
		{
			if(i!=0)
			{
				if(employes[i].compareTo(employes[i]) > 0 )
				{
					grandEmploye = employes[i];
				}
			}
		}
		
		return grandEmploye;
	}
	
	public boolean tester(Employe[] employes_2)
	{
		
		 return Arrays.equals(employes, employes_2);
	
	}
	
}
