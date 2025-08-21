package com.nt.collection;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedCharacter_Test {

	public static void main(String[] args) {
		char[] arr = {'a', 'b', 'c', 'a', 'b', 'a', 'd', 'c', 'c', 'b', 'e', 'e', 'e','e'};
		String st = new String(arr);
	
	   System.out.println(st);
	   
	   TreeMap<Character, Long> collect = st.chars().mapToObj(c -> Character.toLowerCase( (char) c))
	              .collect(Collectors.groupingBy(Function.identity(), TreeMap ::new,Collectors.counting()));
	         
	  //Top 3 characters
	   collect.entrySet().stream().sorted(Map.Entry.<Character,Long>comparingByValue().reversed())
       .limit(3).forEach(e -> System.out.println(e.getKey()+" --- "+e.getValue()));
	   
	   //There is a character array, print the 3rd most repeated character.
	   collect.entrySet().stream().sorted(Map.Entry.<Character,Long>comparingByValue().reversed())
	                     .skip(2).limit(1).forEach(e -> System.out.println(e.getKey()+" -"+e.getValue()));
	}

}
