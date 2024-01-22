package pk2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vehicule vh = new Vehicule("marque","vert");
		
		Voiture vr = new Voiture("marque2","bleu","modele2",2);
		
	System.out.println(vh.toString());
	System.out.println(vr);
	
	
 Vehicule vh2 = vr.nvVehicule();
	System.out.println(vh2.toString());
	
	
	
	Vehicule vh3 = new Voiture("marque3","bleu","modele3",4);
	
	vh3.nvVehicule(); // Voiture
	
	
	// vh3.faire(); // erreur de compilation
	
	((Voiture)vh3).faire(); // ok 
	
	if(vh3 instanceof Camion)
	((Camion)vh3).doJob(); // erreur de type CCE
	


	}

}
