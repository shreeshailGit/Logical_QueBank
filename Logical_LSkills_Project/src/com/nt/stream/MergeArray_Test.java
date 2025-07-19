package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//19 July 2025
public class MergeArray_Test {

	public static void main(String[] args) {
		    Integer[] arr1 = {5, 1, 9, 3};
	        Integer[] arr2 = {8, 2, 7, 4};
	        
	        
	        List<Integer> list = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().collect(Collectors.toList());
	
	        
	        System.out.println(list);
	}
}
