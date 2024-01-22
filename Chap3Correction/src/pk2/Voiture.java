package pk2;

public class Voiture extends Vehicule {

	
	private String modele;
	private int nbPorte;
	@Override
	public String toString() {
		return super.toString() + ", modele=" + modele + ", nbPorte=" + nbPorte ;
	}
	public Voiture(String marque, String couleur, String modele, int nbPorte) {
		super(marque, couleur);
		
		this.modele = modele;
		this.nbPorte = nbPorte;
	}
	
	@Override
	public Voiture nvVehicule() {
		return new Voiture(null, null, this.modele, this.nbPorte);
	}
	
	
	public void faire() {
		System.out.println("faire traitement");
	}
	
//	public Voiture() {
//		super();
//	}
	
	
	
}
