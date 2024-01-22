package ex3;

public class Personne {
	private String nom,prenom, cin;
	private int age;
	
	
	public Personne(String nom, String prenom, String cin, int age) {
		this.nom= nom;
		this.prenom= prenom;
		this.cin= cin;
		this.age= age;

	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	
	public void setCin(String cin) {
		this.cin = cin;
	}
	
	
	public void afficher() {
		System.out.println(getClass().getSimpleName() + "Cin : " + cin + " Nom : " + nom + " Prenom : " + prenom + " Age : " + age);
	}
	

}
