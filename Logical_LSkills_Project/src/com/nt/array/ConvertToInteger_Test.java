package com.nt.array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertToInteger_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int arr[] = {12, 35, 1, 10, 34, 1};		
			System.out.println(" Hello World = "+ Arrays.stream(arr).boxed().collect(Collectors.toList()));

		
	}

}
