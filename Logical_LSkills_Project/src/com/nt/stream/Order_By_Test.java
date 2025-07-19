package com.nt.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Order_By_Test {
//2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(123,23,14,160,90,200,300,1200);
		
		System.err.println("=== all the numbers starting with 1 =============================");	
		list.stream().map(s-> "" + String.valueOf(s)).filter(i-> i.startsWith("1")).forEach(System.out::println);
		
		System.err.println("=== Ascending order =============================");	
		//Ascending order
		list.stream().sorted().forEach(System.out::println);
       System.err.println("====Descending order ============================");
	
     //Descending order
	   list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
