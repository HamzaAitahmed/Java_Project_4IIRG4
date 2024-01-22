package pk1;

import static java.util.stream.Collectors.toList;
import static pk1.Dish.menu;


import java.util.Arrays;
import java.util.List;



public class TestDish {

	public static void main(String[] args) {

		
		
		System.out.println("***********************Menu***********************");

		  menu.forEach(System.out::println); // Consumer
	   
	    System.out.println("***********************Les vegetarians ***********************");
	    List<Dish> vegetarianMenu = menu.stream() // Stream<Dish>
	        .filter(Dish::isVegetarian) // Predicate
	        // .filter(d->d.isVegetarian()==true)
	        .toList(); // List<Dish>
	    vegetarianMenu.forEach(System.out::println);

	   
	    System.out.println("***********************Les nombres pairs (sans les doublons):***********************");
	    List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
	    numbers.stream() // Stream<Integer>
	        .filter(i -> i % 2 == 0)
	        .distinct()
	        .forEach(System.out::println); // void

	   
	    // Une liste triée en fct des calories
	    List<Dish> specialMenu = Arrays.asList(
	        new Dish("season fruit", true, 120, Dish.Type.OTHER),
	        new Dish("prawns", false, 300, Dish.Type.FISH),
	        new Dish("rice", true, 350, Dish.Type.OTHER),
	        new Dish("chicken", false, 400, Dish.Type.MEAT),
	        new Dish("french fries", true, 530, Dish.Type.OTHER));
	    
	    System.out.println("***********************Filter une liste triée:***********************");
	    List<Dish> filteredMenu = specialMenu.stream()
	        .filter(dish -> dish.getCalories() < 320)
	        .toList();
	    filteredMenu.forEach(System.out::println);

	    System.out.println("***********************Filter une liste triée: takeWhile()***********************");
	    List<Dish> slicedMenu1 = specialMenu.stream()
	        .takeWhile(dish -> dish.getCalories() < 320)
	        .toList(); // .collect(toList())
	    slicedMenu1.forEach(System.out::println);


	    System.out.println("***********************Filter une liste triée: dropWhile()***********************");
	    List<Dish> slicedMenu2 = specialMenu.stream()
	        .dropWhile(dish -> dish.getCalories() < 320)
	        .toList();
	    slicedMenu2.forEach(System.out::println);

	    System.out.println("***********************Limiter le résultat***********************");
	    List<Dish> dishesLimit3 = menu.stream()
	        .filter(d -> d.getCalories() > 300)
	        .limit(3)
	        .toList();
	    dishesLimit3.forEach(System.out::println);

	    System.out.println("***********************ignorer des éléments du résultat***********************");
	    List<Dish> dishesSkip2 = menu.stream()
	        .filter(d -> d.getCalories() > 300)
	        .skip(2)
	        .toList();
	    dishesSkip2.forEach(System.out::println);
	    
	    System.out.println("***********************Les repas (Name) ***********************");
  
	 // map
	    List<String> dishNames = menu.stream() // Stream<Dish>
	    		.map(Dish::getName) // Function <Dish,String> { String apply(Dish d) {d.getName()}}
	    		.toList();
	    System.out.println(dishNames);
	    
	    System.out.println("***********************Les calories des repas ***********************");
	    
		 // map
		    List<Integer> dishCalories = menu.stream() // Stream<Dish>
		        .map(Dish::getCalories) // Stream<Integer>
		        .toList();
		    System.out.println(dishNames);
		
		    System.out.println("***********************Autre exemple du map ***********************");

	    // map
	    List<String> words = Arrays.asList("Hello", "World");
	    List<Integer> wordLengths = words.stream() //Stream<Strin>
	        .map(String::length) // Function<String,Integer> // Stream<Integer>
	        .collect(toList());
	    System.out.println(wordLengths);

	}

}
