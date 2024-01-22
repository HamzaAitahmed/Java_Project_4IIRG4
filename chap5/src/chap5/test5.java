package chap5;
import java.util.Arrays;
import java.util.List;
public class test5 {

	public static void main(String[] args) {
		
		int [] tab = new int[5];
		
		int v =(int)(Math.random()*100);
		
		Arrays.fill(tab,v);
		
		System.out.println(Arrays.toString(tab));
		
		for(int i=0; i<tab.length;i++)
			tab[i]=(int)(Math.random()*10);
			
		System.out.println(Arrays.toString(tab));
		
		Integer T1[] = { 10, 20, 30, 40 };
		
		List<Integer> list = Arrays.asList(T1);
		
		System.out.println(list);
			
		
		int[] T2 = { 2, 4, 5, 9, 5, 9 };
		int[] res = Arrays.copyOf(T2, 3);
		System.out.println(Arrays.toString(res));
		// [2, 4, 5]
		int[] res2 = Arrays.copyOf(T2, 10);
		System.out.println(Arrays.toString(res2));

			
		
		
		
	}

}
