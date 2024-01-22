package chap5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TableauDesEmployes {

	
	public Employe[] employes = new Employe[5];
	
	public void remplir() {
		
		employes[0]= new Employe("ABOUTANI","Aicha","AZE3456",40000);
		employes[1]= new Employe("AIT AHMED","Hamza","SDE456",35000);
		employes[2]= new Employe("RIZKI","Imane","DE4567",20000);
		employes[3]= new Employe("LAGDAR","Omar","DER4567",25000);
		employes[4]= new Employe("BOUAZZA","Yassine","BZ5667",70000);
		
	}
	
	public void trier(Comparator<Employe> cmp) {
		Arrays.sort(employes,cmp);
	};
	
	public double calculerSalaires() {
		double somme=0;
		for(Employe emp : employes)
			somme+=emp.getSalaire();
		return somme;
	}
	
	public double calculerMoyenne() {
		return this.calculerSalaires()/employes.length;
		
	}
	
	public boolean tester(Employe emp1) {
		for(Employe emp:employes)
			if(emp.equals(emp1))
				return true;
		return false;
	}
	
	public boolean supprimer(Employe emp) {
		
		if(!this.tester(emp)) return false;
		
		ArrayList<Employe> liste =new ArrayList<Employe>(Arrays.asList(employes));
		
		liste.remove(emp);
		
		employes = liste.toArray(new Employe[liste.size()]);
		
		return true;
		
	}
	
	public Employe[] copie(int start,int end) {
		if(start>=0 && start <end)
		return Arrays.copyOfRange(employes, start, end);
		
	throw new IllegalArgumentException("Probleme d'index");
		
	}
	
	public void ajouter(Employe emp,int pos) {
		if(pos>=0 && pos<employes.length)
		{
		ArrayList<Employe> liste = new ArrayList<Employe>(Arrays.asList(employes));
		liste.add(pos, emp);
		employes= liste.toArray(new Employe[liste.size()]);	
	}
		throw new IllegalArgumentException("La position doit étre"+"comprise entre 0 et la taille");
	}
	
	public void afficherSalaireMaxMin() {
		Arrays.sort(employes,new CmpSalaire());
		System.out.println("Le saliare max est:" +employes[employes.length-1].getSalaire()+",et le salaire min est:" +employes[0].getSalaire());
		}
	
	
	public void inverser() {
		ArrayList<Employe> liste = new ArrayList<Employe>(Arrays.asList(employes));
		Collections.reverse(liste);
		employes= liste.toArray(new Employe[liste.size()]);	
	
	}
	
	public Employe EmplPlusGrandSalaire() {
		
		Arrays.sort(employes, new CmpSalaire());
		return employes[employes.length-1];
		
	}
	
	public boolean testerEgaliter(Employe[]tab) {
		return Arrays.equals(employes,tab);
		
	}
	
	public void afficher() {
		for(Employe emp:employes)
			System.out.println(emp);
	}
	
} 

	
	
