package S6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import Pk___1.Employe;

public class ListeDesEmployes {
	List<Employe> liste = new ArrayList<Employe>();

	public void remplir() {
		liste.add(new Employe("aboutani","aicha","AZR665",40000));
		liste.add(new Employe("aitdadali","hassan","AHJ265",200000));
		liste.add(new Employe("rizki","imane","AXN965",40000));
		liste.add(new Employe("Lgdar","omar","AZR165",40500));
		liste.add(new Employe("Bouslim","houssam","NBR665",450000));
	}
	
	public void ajouteEmploye(Employe e) {
		liste.add(0,e);
	}
	
	public void afficheListe()
	{
		for(Employe emp: liste)
		{
			System.out.println(emp.toString());
		}
	}
	
	public void parcourIt()
	{
		Iterator<Employe> it = liste.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	public Employe recuperer(int index)
	{
		if(index>=0 && index<liste.size())
		{
			return liste.get(index);
		}
		throw new IllegalArgumentException("L'indice doit etre compris entre 0 et la taille de la liste");
	}
	
	
	public void mettreAjour(Employe emp, int index)
	{
		if(index>=0 && index < liste.size())
		{
			liste.set(index, emp);
		}
	}
	
	public void mettreAjour(Employe oldEmp, Employe newEmp)
	{
		Collections.replaceAll(liste, oldEmp, newEmp);
	}
	
	public boolean suprimmerEmploye(Employe emp)
	{
		return liste.remove(emp);
	}
	
	public boolean rechercherEmploye(Employe emp)
	{
		return liste.contains(emp);
		
	}
	
	public void trierEmployes(Comparator<Employe> cmp)
	{
		Collections.sort(liste,cmp);
	}
	
	public ArrayList<Employe> copieListe()
	{
		ArrayList<Employe> newList = new ArrayList<Employe>();
		newList.addAll(liste);
		return newList;
	}
	
	public void melangerList()
	{
		Collections.shuffle(liste);
	}
	
	public void inreverseList()
	{
		Collections.reverse(liste);
	}
	
	public ArrayList<Employe> subListe(int start, int end)
	{
		if(start>=0 && end<liste.size() && start<end)
		{
			return new ArrayList<Employe>(liste.subList(start,end));
		}
		throw new IllegalArgumentException("un problem dans start ou end ");
	}
	
	public boolean compareList(ArrayList<Employe> liste2)
	{
		return liste.equals(liste2); // true if liste === liste2 ,meme nature meme taille 
	}
	
	public void echangerList(int p1, int p2)
	{
		Collections.swap(liste, p1, p2);
	}
	
	public void viderList()
	{
		liste.clear();
	}
	
	public boolean listEstVide()
	{
		return liste.isEmpty();
	}
	
	
	
}
