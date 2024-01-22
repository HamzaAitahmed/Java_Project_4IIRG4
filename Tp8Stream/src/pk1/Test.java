package pk1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		System.out.println("******************Stream.of*******************");
	    Stream<String> stream = Stream.of("IIR", "Casablaca", "Maroc", "");
	    stream.map(String::toUpperCase).forEach(System.out::println);

		  System.out.println("******************Stream.empty*******************");

	   
	    Stream<String> emptyStream = Stream.empty();
	    emptyStream.forEach(System.out::println);

		  System.out.println("******************Arrays.stream*******************");

	   
	    int[] numbers = { 2, 3, 5, 7, 11, 13 };
	    List<Integer> liste =  Arrays.asList( 2, 3, 5, 7, 11, 13 );
	    Stream<Integer> stream1 = liste.stream();
	    IntStream intStream = liste.stream().mapToInt(i->i);
	    System.out.println("La somme des éléments du tableau :" + Arrays.stream(numbers).sum()); // la somme des nombres
	    System.out.println("Le nombre des éléments du tableau :" + Arrays.stream(numbers).count());
	    System.out.println("La moyenne des éléments du tableau :" + Arrays.stream(numbers).average().getAsDouble());
	    System.out.println("Le max des éléments du tableau :" + Arrays.stream(numbers).max().getAsInt());
	    System.out.println("Le min des éléments du tableau :" + Arrays.stream(numbers).min().getAsInt());

	    
	    System.out.println("La somme des éléments de la liste :" + liste.stream().mapToInt(i->i).sum()); // la somme des nombres
	    System.out.println("Le nombre des éléments de la liste :" + liste.stream().mapToInt(i->i).count());
	    System.out.println("La moyenne des éléments de la liste :" + liste.stream().mapToInt(i->i).average().getAsDouble());
	    System.out.println("Le max des éléments de la liste :" + liste.stream().mapToInt(i->i).max().getAsInt());
	    System.out.println("Le min des éléments de la liste :" + liste.stream().mapToInt(i->i).min().getAsInt());

		System.out.println("******************Stream.iterate*******************");
		
	    Stream.iterate(0, n -> n + 2)
	        .limit(10)
	        .forEach(System.out::println);

		System.out.println("******************Stream.generate*******************");

		Stream.generate(()->Math.random())
        .limit(10)
        .forEach(System.out::println);
		
		Stream.generate(Math::random)
	        .limit(10)
	        .forEach(System.out::println);
		System.out.println("******************InStream.generate*******************");

	    
	    IntStream.generate(() -> 1)
	        .limit(5)
	        .forEach(System.out::println);


	}

}
