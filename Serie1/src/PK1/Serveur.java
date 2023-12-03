package PK1;
public class Serveur extends Employe {
	String nom , specialite  ;

	public Serveur(String nom, String id, String specialite) {
		super(nom, id);
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return super.toString() + " specialite=" + specialite ;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj)) return false;
		if(obj instanceof Serveur) {
		Serveur other = (Serveur) obj;
		return this.specialite==other.specialite;
		}
		return false;
	}

	@Override
	protected Serveur clone(){
		
			return (Serveur)super.clone(); // class fille
		
	}
	
	
	
}
