package ex2;

class PointNom extends Point {
	
	PointNom(int x, int y, char nom) {
		super(x, y);
		this.nom = nom;
	}

	private char nom;
	
	
	@Override
	public boolean identique(Point a) {
		
		if(a instanceof PointNom)
		return super.identique(a) && this.nom==((PointNom)a).nom;
	return false;
	
	}
	
	
	
	public static boolean identiques(PointNom a, PointNom b) {
		return Point.identiques(a, b) && a.nom ==b.nom;
	}
	
	
	
	
	
	
	
	
}