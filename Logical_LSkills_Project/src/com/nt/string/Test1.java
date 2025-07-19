package com.nt.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		String s1 = "ONE";
		
		s1.concat("TWO");
		s1.concat("THREE");
		System.out.println(s1);
		
	
		Long l1 = 1000l;
		Long l2 = 1000l;
		Long l3 = l1;
		Long l4 = l3;
		System.out.println(l1 == l2);
		System.out.println(l1 == l3);
		System.out.println(l1 == l4);
		
		
		
		Double d1 = 1000.0;
		Double d2 = 1000.0;
//		Long l3 = l1;
//		Long l4 = l3;
//		System.out.println(d1 == d2);
//		System.out.println(l1 == l3);
//		System.out.println(l1 == l4);
		
		//how u make custom class as Immutable
		//make class as final
		//take instance varibale 
		//take parameterized constructor
		//one static method 
	
	
	}

}
