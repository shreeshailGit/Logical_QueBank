package com.nt.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperation_Test {

	public static void main(String[] args) {
	
		//print all names from list
		List<String> list = Arrays.asList("Alice","Bob","Charlie");
		list.stream().forEach(System.out::println);
		
		//print a list of numbers greater than 10 from a given list
		List<Integer> numberGreaerThan10 = Arrays.asList(15,20,8,30);
		numberGreaerThan10.stream().filter( num -> num > 10).collect(Collectors.toList());
		System.out.println(numberGreaerThan10);
		
		//Prin sum of all integers
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		Integer sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum);
		
		//count the number of strings with length greater than 3
		List<String> list1 = Arrays.asList("Hi","Hello","World","Java");
		List<String> collect = list1.stream().filter(st -> st.length() > 3).collect(Collectors.toList());
		System.out.println(collect);
		
		//print the number which is greater than 10
		List<Integer> numbers1 = Arrays.asList(5,8,12,20);
		Optional<Integer> first = numbers1.stream().filter(num -> num > 10).findFirst();
        first.ifPresent(num -> System.out.println("First num > 10 is "+num));		
	
        //Check if all numbers in a list are even allMatch 
        List<Integer> numbers2 = Arrays.asList(2,4,6,8);
        boolean allMatch = numbers2.stream().allMatch(num -> num % 2 == 0);
        System.out.println("allMatch :"+allMatch);
        
        //Check if any number in a list is greater than 50
        List<Integer> numbers3 = Arrays.asList(10,20,30,40);
        boolean anyMatch = numbers3.stream().anyMatch(num -> num > 50);
        System.out.println("anyMatch :"+anyMatch);
        
        //Check if no string in a list starts with "Z"
        List<String> list2 = Arrays.asList("Alice","Bob","Charlie","Zishan"); 
        boolean noNamesMatchWithZ = list2.stream().noneMatch( s -> s.startsWith("Z"));
        System.out.println("noNamesMatchWithZ = "+noNamesMatchWithZ );
        
        //convert a list of string to an Array
	    String[] namesArray = list2.toArray(String[] :: new);
         System.out.println(Arrays.toString(namesArray));
	}

}
