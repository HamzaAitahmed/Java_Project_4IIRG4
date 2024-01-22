package S6;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class LinkedListDesEmployes {
	
	LinkedList<Employe> liste= new LinkedList<Employe>();
	
	public void ajouter(Employe e)
	{
		liste.add(e);
	}
	
	public void afficher()
	{
		for(Employe emp:liste)
		{
				System.out.println(emp);
		}
	}
	
	public void parcourIt()
	{
		Iterator<Employe>it =liste.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void parcourItInverse()
	{
		Iterator<Employe>it =liste.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void parcourItInverseV2()
	{
		ListIterator<Employe>it =liste.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}
	
	public void insererEmploye(int pos,Employe emp)
	{
		if(pos>=0 && pos<liste.size())
		{
			liste.add(pos,emp);
		}
	}
	
	public void insererAuDebut(Employe emp)
	{
		liste.addFirst(emp);
	}
	
	public void insererAFin(Employe emp)
	{
		liste.addLast(emp);
	}
	
	public void afficherFirstLast()
	{
		System.out.println("First : "+liste.getFirst()+" Last : " +liste.getLast());
	}
	
	public void afficherEmploye()
	{
		int cpt=0;
		for(Employe e : liste)
		{
			System.out.println(++cpt + " " + e);
		}
	}
	
	public boolean supprimerEmploye(Employe e)
	{
		return liste.remove(e);
	}
	
	public void supprimerPremierDernierEmploye()
	{
		liste.removeFirst();
		liste.removeLast();
	}
	
	public void viderEmploy()
	{
		liste.clear();
	}
	
	public void joindreEmploye(List<Employe> empList)
	{
		liste.addAll(empList);
	}
	
	public LinkedList<Employe> cloner()
	{
		return (LinkedList<Employe>)liste.clone();
	}
	
	public Employe supprimerRenvoyerPremierEmploye()
	{
		return liste.removeFirst();
		// supprimer est renvoyer le premier element de la liste
	}
	
	public Employe recupererPremierEmploye()
	{
		return liste.getFirst();
	}
	
	public Employe recupererDernierEmploye()
	{
		return liste.getLast();
	}
	
	public boolean existeEmploye(Employe emp)
	{
		return liste.contains(emp);
		// il verifier si employe existe
	}
	
	public Employe[] convertirTableau()
	{
		return liste.toArray(new Employe[liste.size()]);
	}
	
	public boolean compareList(LinkedList<Employe> emps)
	{
		return liste.equals(emps);
	}
	
	public boolean listEstVide()
	{
		return liste.isEmpty();
	}
	
	public void remplaceEmploye(Employe E1,Employe E2)
	{
		Collections.replaceAll(liste, E1, E2);
	}
	
}
