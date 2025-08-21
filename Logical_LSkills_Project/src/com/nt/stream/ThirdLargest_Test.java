package com.nt.stream;

import java.util.Arrays;
import java.util.List;

public class ThirdLargest_Test {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 20, 3);
		//List<Integer> numbers = Arrays.asList(10, 5);
		
		Integer thirdLargest = numbers.stream().distinct().sorted((a,b) -> b - a)
		                .skip(2)
		                .findFirst()
		                .orElseThrow(() -> new RuntimeException("Less than 3 unique numbers"));
		
		 System.out.println("Third largest number: " + thirdLargest);

	}

}
