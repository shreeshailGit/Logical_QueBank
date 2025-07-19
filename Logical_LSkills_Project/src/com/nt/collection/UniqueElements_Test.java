package com.nt.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElements_Test {
    //Find unique elements in ascending order
	
	public static void main(String[] args) {
		String str = "Java is fund and Java is Powerfull";

		  String[] words = str.split(" ");
		  
		  List<String> uniqueElemntsWithSort = Arrays.stream(words).distinct().sorted().collect(Collectors.toList());
	
	    System.out.println("Unique elements with sorted "+uniqueElemntsWithSort);
	}

}
