package atelier4;

public abstract class Employée {
	
	String nom;
	String prenom;
	int age;
	String date;
	
	public abstract double calculerSalaire();
	
	public String getNom(){
		
		return (this.getClass().getSimpleName()+":"+ this.nom +"  "+ this.prenom);
	}

	public Employée(String nom, String prenom, int age, String date) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.date = date;
	
}}
