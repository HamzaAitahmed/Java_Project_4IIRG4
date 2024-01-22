package correction;

public class Manutention extends Employe{
 private int nbT;

public Manutention(String nom, String prenom, int date, int age, int nbT) {
	super(nom, prenom, date, age);
	this.nbT = nbT;
}

@Override
public double calculerSalaire() {
	// TODO Auto-generated method stub
	return nbT*65;
}
  
}
