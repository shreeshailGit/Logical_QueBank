package com.nt.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummationOf_Integer_Test {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		List<Integer> list = new ArrayList();
		
		for(int i=0; i<arr.length; i++) {
			list.add(Integer.valueOf(arr[i]));
		}
		System.out.println(list);
		
		Integer sum = list.stream().filter(n->n%2==0)
		             .mapToInt(Integer :: intValue)
		             .sum();
		
		System.out.println("Total summation of Even No :"+sum);
		
		//Using Java 8
		List<Integer> secondList = Arrays.asList(4,6,7,8,10);	
		Integer summ = secondList.stream().collect(Collectors.summingInt(Integer :: intValue));
		System.out.println("SUMM"+summ);

	}

}
