package ex2;

public class Point {
	
	public Point(int x,int y)
	{this.x=x;this.y=y; }

	public static boolean identiques(Point a, Point b) {
		return ((a.x == b.x) && (a.y == b.y));
	}

	public boolean identique(Point a) {
		return ((a.x == x) && (a.y == y));
	}

	private int x, y;
}
