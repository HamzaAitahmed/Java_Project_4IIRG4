package pk2;

public class Vehicule {
	
	
	private String marque;
	private String couleur;
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+ ": marque=" + marque + ", couleur=" + couleur ;
	}
	
	public Vehicule(String marque, String couleur) {
		super();
		this.marque = marque;
		this.couleur = couleur;
	}
	
	
	
	
	
//	public Vehicule() {
//		super();
//	}
	
	
	
	protected Vehicule nvVehicule() {
		return new Vehicule(this.marque, this.couleur);
	}
	
	

}
