package com.nt.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cognizant_Test {

	public static void main(String[] args) {
	//Q 1
		List<String> list = Arrays.asList("Welcome", "Cognizant");

		Stream<String> str = list.stream();

		str.forEach(System.out::println);

		//str.forEach(System.out::println);//java.lang.IllegalStateException

	// Q 2 print the element characters from the above list line by line using flatmap?
     	//list.stream().flatMap(list -> list.stream()).forEach(System.out::println); Wrong
		
		list.stream().flatMap(st -> st.chars().mapToObj(c -> (char) c)).forEach(System.out::println);
		
		System.err.println(" 2nd question end");
		
	// Q 3
		String st = "swiss";
		Optional<Character> nonrepeatedCharacter = st.chars().mapToObj(c -> Character.toLowerCase( (char) c))
		          .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		          .entrySet()
		          .stream()
		          .filter(entry -> entry.getValue() == 1L)
		          .map(entry -> entry.getKey()).findFirst();
		
		nonrepeatedCharacter.ifPresent(System.out::println);
		
	//Q 4 try with catch block is compulsory ? No, we can use try with finally block 
		// but only try block will give compilation error or not recommended way
		//try with resource is coming in java 1.7 version ,in that catch and finally block is not not required.
		
		
	}

}
