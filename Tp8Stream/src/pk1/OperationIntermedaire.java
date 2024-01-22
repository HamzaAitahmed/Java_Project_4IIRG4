package pk1;

import static java.util.stream.Collectors.toList;
import static pk1.Dish.menu;
import static java.util.Comparator.comparing;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperationIntermedaire {

	public static void main(String[] args) {
		
	   
	    System.out.println("***********************Filter ***********************");
	    Stream<Dish> vegetarianMenu = menu.stream() // Stream<Dish>
	    		.filter(dish -> dish.isVegetarian());// Predicate
	    		//.filter(Dish::isVegetarian); 
	         
	    System.out.println("***********************Distinct***********************");
	    List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
	    numbers.stream() // Stream<Integer>
	        .distinct(); // supprimer les doublons
	    
	    System.out.println("***********************sorted***********************");
	    Stream<Dish> filteredMenu = menu.stream()
	    	.sorted((d1,d2)->d1.getCalories()-d2.getCalories())
	    	//.sorted(comparing(Dish::getCalories))
	        .filter(dish -> dish.getCalories() < 320);

	    System.out.println("***********************takeWhile()***********************");
	    Stream<Dish> slicedMenu1 = menu.stream()
	    	.sorted(comparing(Dish::getCalories))
	        .takeWhile(dish -> dish.getCalories() < 320);


	    System.out.println("***********************dropWhile()***********************");
	    Stream<Dish> slicedMenu2 = menu.stream()
	    	.sorted(comparing(Dish::getCalories))
		    .dropWhile(dish -> dish.getCalories() < 320);

	    System.out.println("***********************Limiter le résultat***********************");
	    Stream<Dish> dishesLimit3 = menu.stream()
	        .limit(3);

	    System.out.println("***********************ignorer des éléments du résultat***********************");
	    Stream<Dish> dishesSkip2 = menu.stream()
	        .skip(2);
	    
	    System.out.println("***********************Les repas (Name) ***********************");

	 // map
	    Stream<String> dishNames = menu.stream() // Stream<Dish>
	    		//.map(Dish::getName); // Function <Dish,String> { String apply(Dish d) {d.getName()}}
	    		.map(d->d.getName());
	    
	    System.out.println("***********************Les calories des repas ***********************");
	    
		 // map
		    Stream<Integer> dishCalories = menu.stream() // Stream<Dish>
		        .map(Dish::getCalories); // Stream<Integer>
		
		    System.out.println("***********************Les calories des repas ***********************");
		    
			 // map
			    IntStream calories = menu.stream() // Stream<Dish>
			        .mapToInt(Dish::getCalories); // IntStream
			
	}

}
