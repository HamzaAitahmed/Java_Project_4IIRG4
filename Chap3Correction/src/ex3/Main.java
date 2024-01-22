package ex3;

public class Main {

	public static void main(String[] args) {

		Personne p = new Personne("EL GOUMRI", "reda", "cn123", 21);
		Etudiant t =  new Etudiant("Hassani", "OMAR", "cnAZE", 21, "cne1234");
		
		
		// héritage simple
		p.afficher();
		t.afficher();
		
		
		// polymorphisme
		p = new Etudiant("Hassani", "OMAR", "cnAZE", 21, "cne1234");
		p.afficher();
		
		System.out.println(p.getClass());
	}

}
