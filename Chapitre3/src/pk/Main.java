package pk;

public class Main {

	public static void main(String[] args) {

		
		Personne personne = new Personne("Filali","Ahmed","SD56789"); // constructeur par defaut
		Employe employe = new Employe("Chanaoui","Noura","ZE4567","sd23456",20000);
		Personne personne2 = new Employe("Ahmadi", "Saad","SC4567","098765",10000);
		// polymerphiosme
		
		personne.afficherInfo();
		employe.afficherInfo();
		personne2.afficherInfo();
		System.out.println(((Employe)personne2).calculerSalaireTotal());
		
		personne2= new Etudiant("Karam", "Chadia", "DF4567", "EMSI");
		
		if(personne2 instanceof Employe)
		System.out.println(((Employe)personne2).calculerSalaireTotal());
		else
			System.out.println("la personne n'est pas un employe");
		;
		
		Personne[] personnes = new Personne[3];
		personnes[0] = new Personne("Filali","Ahmed","SD56789"); 
		personnes[1] = new Employe("Chanaoui","Noura","ZE4567","sd23456",20000);
		personnes[2] =new Etudiant("Karam", "Chadia", "DF4567", "EMSI");
		
		
		for(Personne per: personnes)
			per.afficherInfo();
		
		System.out.println("*******************");
			
		for(Personne per: personnes)
			if(per instanceof Employe)
				System.out.println(((Employe)per).calculerSalaireTotal());
		
		
		
		

	}

}
