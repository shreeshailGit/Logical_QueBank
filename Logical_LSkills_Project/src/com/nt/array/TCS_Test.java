package com.nt.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TCS_Test {

	public static void main(String[] args) {

//Question 1
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4);
		
		List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("distinct elem"+collect);
	
//Question 2
		String str1 = "Hello";  
		String str2 = "Hello";
		String str3 = new String("Hello");

		System.out.println(str1 == str2);  //true     
		System.out.println(str1 == str3);  //false
		      
		System.out.println(str1.equals(str2));  //true
		System.out.println(str1.equals(str3));   //true
	}

}
