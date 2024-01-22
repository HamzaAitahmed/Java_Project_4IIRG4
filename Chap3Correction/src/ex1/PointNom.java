package ex1;

public class PointNom extends Point  {
	
	public PointNom(int x, int y, char nom) {
		super(x, y);
		this.nom = nom;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void affiche() {
		
		System.out.print(nom +" ");
		super.affiche();
	}

	private char nom; 
	
	

}
