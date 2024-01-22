package pk2;

public class Camion extends Vehicule {
	
	private int chargeMaxe;

	public Camion(String marque, String couleur, int chargeMaxe) {
		super(marque, couleur);
		this.chargeMaxe = chargeMaxe;
	}
	
	public void doJob() {
		System.out.println("do job");
	}

}
