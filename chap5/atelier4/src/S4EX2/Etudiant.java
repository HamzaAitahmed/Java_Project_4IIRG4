package S4EX2;

import java.util.Arrays;

public class Etudiant extends Personne {
	String cne;
	double[] notes;
	boolean[] inscription;
	
	public Etudiant(String nom, String prenom, String dateNaissance, String Cne, double[] notes,
			boolean[] inscription) {
		super(nom, prenom, dateNaissance);
		cne = Cne;
		this.notes = new double[6];
		this.inscription =  new boolean[6];
	}

	public void description()
	{
		System.out.println("Etudiant : Etudiant");
	}
	
	public double Moyenne()
	{
		double sommeNotes=0.0;
		int nbmodules=0;
		for(int i=0 ; i<6 ; i++)
		{
			if(inscription[i])
			{
				sommeNotes+=notes[i];
				nbmodules++;
			}
		}
		return nbmodules > 0 ? sommeNotes/nbmodules : 0.0;
	}
	
	public String Mention()
	{
		for(boolean b : inscription)
		{
			
		}
		
		double Moyenne = Moyenne();
		
		if(Moyenne >= 16){
			return "tres bien"; 
		}
		else if(Moyenne >= 14){
			return "bien"; 
		}
		else if(Moyenne >= 12){
			return "assez bien"; 
		}
		else if(Moyenne >= 10){
			return "Passable"; 
		}
		else{
			return "No Valide"; 
		}
		
	}

	@Override
	public String toString() {
		return super.toString() + " cne=" + cne + " mention : " +  Mention() + "Moyenne : "+ Moyenne();
	}
	
	
	
}
