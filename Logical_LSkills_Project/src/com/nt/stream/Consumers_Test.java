package com.nt.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumers_Test {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();
		
		cities.add("Goa");
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Delhi");
		
		Consumer<String> printConsumer = city-> System.out.println(city);
		
		//cities.forEach(System.out::println);
		printConsumer.accept(cities.get(0));
		printConsumer.accept(cities.get(1));
		
    //example 2
		List<String> names = Arrays.asList("Shreeshail", "Raj", "Sneha");

        Consumer<String> greet = name -> System.out.println("Hello, " + name);

        names.forEach(greet);  // prints Hello, Shreeshail ... etc
	}

}
