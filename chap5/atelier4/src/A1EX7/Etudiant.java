package A1EX7;

public class Etudiant {
	public static int cpt=0;
	String ID;
	
	public Etudiant() {
		ID = String.valueOf(cpt+1);
		cpt++;
	}
	
	public void getldent()
	{
		System.out.println("ID : " + ID);
	}

	public void getldentMax()
	{
		System.out.println("nombre d'objet creer : " + cpt);
	}
	
}
