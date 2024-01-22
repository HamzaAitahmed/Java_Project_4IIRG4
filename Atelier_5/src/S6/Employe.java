package S6;

public class Employe implements Cloneable,Comparable<Employe>{
	
	private String nom;
	private String prenom;
	private String matricule;
	private double salaire;
	
	
	
	public Employe(String nom, String prenom, String matricule, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.salaire = salaire;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return this.matricule==other.matricule;
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", matricule=" + matricule + ", salaire=" + salaire + "]";
	}

	@Override
	protected Employe clone(){
		// TODO Auto-generated method stub
		try {
			return (Employe)super.clone();
			}
		catch(CloneNotSupportedException e){
			return null;
		}
	}

	@Override
	public int compareTo(Employe o) {
		// TODO Auto-generated method stub
		return this.matricule.compareTo(o.matricule);
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



	public String getMatricule() {
		return matricule;
	}



	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}



	public double getSalaire() {
		return salaire;
	}



	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}



	
	
}
