package S4EX2;

public class Professeur extends Personne{
	String CoursEnseigner;

	public Professeur(String nom, String prenom, String dateNaissance, String coursEnseigner) {
		super(nom, prenom, dateNaissance);
		CoursEnseigner = coursEnseigner;
	}

	public void description()
	{
		System.out.println("Status : Professeur");
	}

	@Override
	public String toString() {
		return "Professeur [CoursEnseigner=" + CoursEnseigner + "]";
	}
	
	
	
}
