package com.nt.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//4. Given the list of integers, find the first element of the list using Stream functions?
//5. Given a list of integers, find the total number of elements present in the list using Stream functions?
//6. Given a list of integers, find the maximum value element present in it using Stream functions?
//7. Given a String, find the first non-repeated character in it using Stream functions?
//8. Given a String, find the first repeated character in it using Stream functions?
public class FindFirstElement {

	public static void main(String[] args) {
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 
		 myList.stream().findFirst().ifPresent(System.out::println);
		 
		 long val = myList.stream().count();   System.out.println("Count = "+val);
		
		 //6
		int max =  myList.stream().max(Integer :: compare).get();System.out.println("Maximum element = "+max);

		//7
		String input = "Java articles are Awesome";
		input.chars().mapToObj(c-> Character.valueOf((char) c)).findFirst().ifPresent(System.out::println);
	 
	    //8
		Character character = input.chars().mapToObj(c-> Character.toLowerCase(Character.valueOf((char) c))).
		collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new, Collectors.counting()))
		.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).findFirst().get();
	  
		// System.out.println(character);
	}

}
