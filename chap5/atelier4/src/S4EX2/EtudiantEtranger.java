package S4EX2;

public class EtudiantEtranger extends Etudiant{
	String nationalité;

	public EtudiantEtranger(String nom, String prenom, String dateNaissance, String Cne, double[] notes,
			boolean[] inscription, String Nationalité) 
	{
		super(nom, prenom, dateNaissance, Cne, notes, inscription);
		this.nationalité = Nationalité;
	}
	
	public void description()
	{
		System.out.println("Etudiant Etranger");
	}

	@Override
	public String toString() {
		return "EtudiantEtranger [nationalité=" + nationalité + "]";
	}
	
}
