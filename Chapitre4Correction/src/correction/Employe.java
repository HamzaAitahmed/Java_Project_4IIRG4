package correction;

public abstract class Employe {

	private String nom;
	private String prenom;
	private int date;
	private int age;
	public Employe(String nom, String prenom, int date, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.age = age;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+": nom=" + nom + ", prenom=" + prenom + ", date=" + date + ", age=" + age + ", Salaire: " + this.calculerSalaire(); 
		
	}
	public void afficherNom() {
		System.out.println(this.toString());
	}
	public abstract double calculerSalaire();
	

}
