package com.nt.stream;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccrenceOf_Character_Test {

	public static void main(String[] args) {
		String words = "shreeshail";
		/*
		 * Map<Character, Long> charFrequency = words.stream() //Stream<String>
		 * .flatMap(a -> a.chars().mapToObj(c -> (char) c)) // Stream<Character>
		 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 */
		/* words.chars()
		    .mapToObj(c -> (char) c)
		    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		    .forEach((k, v) -> System.out.println("'" + k + "' = " + v));*/
		
		 Map<Character, Long> collect = words.chars()
		    .mapToObj(c -> (char) c)
		    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//    .forEach((k, v) -> System.out.println("'" + k + "' = " + v));
		 
		 System.out.println(collect);	
		  
		    //OR
		 Map<Character,Long>  sortedByKey = new TreeMap(collect);
		 System.out.println(sortedByKey);
	}

}
