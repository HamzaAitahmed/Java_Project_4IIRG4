package chap5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ListeDesEmployes {

	ArrayList<Employe> employes = new ArrayList<Employe>();
	
	public void remplir() {
		
		employes.add(new Employe("ABOUTANI","Aicha","AZE3456",40000));
		employes.add(new Employe("AIT AHMED","Hamza","SDE456",35000));
		employes.add(new Employe("RIZKI","Imane","DE4567",20000));
		employes.add(new Employe("LAGDAR","Omar","DER4567",25000));
		employes.add(new Employe("BOUAZZA","Yassine","BZ5667",70000));
		
	}
	
	public void parcourIt() {
		
		Iterator <Employe> it =employes.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void ajouterEmp(Employe emp) {
		employes.add(0,emp);}
	
	public Employe recuperEmployer(int index) {
		if (index >= 0 && index < employes.size())
		 	return employes.get(index);
		throw new IllegalArgumentException("indice doit etre compris entre 0 et la taille");
	}
	
	public void mettreAJour(Employe emp, int indice) {
		if (indice >= 0 && indice< employes.size())
	 	 employes.set(indice, emp);
	}
	
	public void mettreAJour(Employe oldEmp,Employe newEmp) {
		Collections.replaceAll(employes, oldEmp, newEmp);
	}	
	
	public boolean supprimerEmploye(Employe emp) {
		return employes.remove(emp);
	}
	
	public boolean rechercheEmploye(Employe emp) {
		return  employes.contains(emp);
	}
	
	public void trierEmployes(Comparator<Employe> cmp) {
		Collections.sort(employes,cmp);
	}
	
	
	
	
	
}
