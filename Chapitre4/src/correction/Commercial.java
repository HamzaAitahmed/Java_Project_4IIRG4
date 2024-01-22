package correction;

public class Commercial extends Employe {
private double ca;

public Commercial(String nom, String prenom, int date, int age, double ca) {
	super(nom, prenom, date, age);
	this.ca = ca;
}

@Override
public double calculerSalaire() {
	return 0.2*ca+400;
}	

}
