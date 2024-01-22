package pk;

public class Test {

	public static void main(String[] args) {

		
		Personne p = new Personne("Karam","Adil",22);
		System.out.println(p.toString());
		
		Etudiant et = new Etudiant("nom","prenom",23, "cne");
//		
		System.out.println(et.toString());
		
		
		Personne p1 = new Etudiant("Karam","Adil",23,"123ZE");
		
		
		
		((Etudiant)p1).afficherInfo();

		
		if(p1 instanceof Professeur)
		{Professeur pr1 = (Professeur)p1;}
		
		else
			System.out.println("l'objet n'est un professeur");
		
//		Professeur pr = new Professeur();
//		
//		Personne p2 =new Professeur();
//		
//		System.out.println(p2.toString());
//		
//		
//		
//		if(p2 instanceof Etudiant)
//		((Etudiant)p2).afficherInfo();
//		Point p66=new PointNom(1,2,'b');
//		p66.affiche();
		
	}

	
	
	

}
