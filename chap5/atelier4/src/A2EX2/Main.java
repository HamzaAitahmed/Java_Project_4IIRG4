package A2EX2;

public class Main {

	public static int max3(int v1 , int v2 , int v3)
	{
		// return Math.max(v2, Math.max(v3, v1));
		return v1> v2 && v1 > v3 ? v1 : v2>v3 && v2>v1 ? v2 : v3 ;
	}
	
	public static double max3(double v1 , double v2 , double v3)
	{
		// return Math.max(v2, Math.max(v3, v1));
		return v1> v2 && v1 > v3 ? v1 : v2>v3 && v2>v1 ? v2 : v3 ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(max3(1,2,3));
	}

}
