package com.nt.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MaximumNo_Test {

	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(10,45,2,30,5);
		    
		    OptionalInt max2 = numbers.stream().mapToInt(Integer :: intValue).max();
		    System.out.println(max2);
		    
		    Optional<Integer> collect = numbers.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
		    System.out.println(collect.get());
		    
		    
		    Optional<Integer> maxNumber = numbers.stream().max(Comparator.naturalOrder());
		    System.out.println("Maximum No = "+maxNumber.get());
		    
		    Optional<Integer> max = numbers.stream().max(Integer :: compareTo);
		    System.out.println("Maximum no using compareTo = "+max.get());
		    
		    Optional<Integer> reduce = numbers.stream().reduce(Integer :: max);
		    System.out.println("Maximum no using reduce() = "+reduce.get());
		    
		    int max6 = numbers.stream().collect(Collectors.summarizingInt(Integer :: intValue)).getMax();
		    System.err.println(max6);
		    
		    
		    Optional<Integer> max7 = numbers.stream().max(Comparator.comparing(Integer :: intValue));
		      System.out.println(max7.get());
		    
		     Optional<Integer> maxNumByIntValue = numbers.stream().max(Comparator.comparing(Integer :: intValue)); 
	       System.out.println("maxNumByIntValue = "+maxNumByIntValue.get());
	}

}
