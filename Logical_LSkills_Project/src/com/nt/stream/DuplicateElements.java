package com.nt.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

//3. How to find duplicate elements in a given integers list in java using Stream functions?
public class DuplicateElements {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		HashSet<Integer> set = new HashSet<>();
		
		myList.stream().filter(i-> !set.add(i)).forEach(System.out::println);
		
		//find  distinct elements
		List<Integer> list = myList.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
	}

}
