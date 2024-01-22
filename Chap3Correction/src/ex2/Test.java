package ex2;

public class Test {

	public static void main(String[] args) {
		
		Point p = new Point (2, 4) ;
		PointNom pn1 = new PointNom(2, 4, 'A');
		PointNom pn2 = new PointNom(2, 4, 'B');
		
		
		
		System.out.println(pn1.identique(pn2)); //false
		System.out.println(p.identique(pn1)); // true
		
		System.out.println(pn1.identique(p)); // false
		System.out.println(Point.identiques(pn1, pn2)); //true
		
		
		
		

	}

}
