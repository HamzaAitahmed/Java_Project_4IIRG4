package pk1;

import static java.util.stream.Collectors.toList;
import static pk1.Dish.menu;

import java.util.Arrays;
import java.util.List;


public class OperationTerminale {

	public static void main(String[] args) {
		
	   
	    System.out.println("*********************** toList() ***********************");
	    List<Dish> vegetarianMenu = menu.stream() // Stream<Dish>
	        .filter(Dish::isVegetarian) 
	        .toList(); // List<Dish>

	   
	    System.out.println("*********************** forEach() ***********************");
	    menu.stream() // Stream<Dish>
	        .filter(Dish::isVegetarian) 
	        .forEach(d->System.out.println(d));
	       // .forEach(System.out::println);
	    
	    System.out.println("*********************** sum ***********************");

	    int calories = menu.stream()
	            .mapToInt(Dish::getCalories)
	            .sum();
	    
	    System.out.println("*********************** max ***********************");

	    int max = menu.stream()
	            .mapToInt(Dish::getCalories)
	            .max() // OptionalInt;
	            .getAsInt();
	    
	    System.out.println("*********************** min ***********************");

	    int min = menu.stream()
	            .mapToInt(Dish::getCalories)
	            .min() // OptionalInt;
	            .getAsInt();
	    
	    System.out.println("*********************** count ***********************");

	    long nbDishes = menu.stream()
	            .count();
	}

}
