package com.nt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Test {

	public static void main(String[] args) {
    
		List<String> cities = new ArrayList<>();
		
		cities.add("Goa");
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Delhi");
		
		Predicate<String>  filterCity = city -> city.equals("Mumbai");
		
		cities.stream().filter(filterCity).forEach(System.out::print);
		
	}

}
