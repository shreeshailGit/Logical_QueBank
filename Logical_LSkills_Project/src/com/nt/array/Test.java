package com.nt.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		String s = "shreeshail";
		
	   Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c)
			   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	   System.out.println(collect);
	   
	   List<Integer> list = Arrays.asList(40,20,30,10);
	   
	 Integer high = list.stream().sorted(Comparator.reverseOrder()).skip(3).findFirst().get();
//	   System.out.println(highestEle);
		/*
		 * Integer SecondHighestElement = Arrays.stream(numbers)
		 * .boxed().sorted(Comparator.reverseOrder()) .skip(1).findFirst().get();
		 */
	}

}
