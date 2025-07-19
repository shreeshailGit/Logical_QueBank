package com.nt.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountofElement {

	public static void main(String[] args) {
		int[] arr = {10,20,30,90,20,40,40};
		
	//frequencyofElement(arr);
		//     System.out.println("Frequenecy of elemnt ::"frequencyofElement(arr));
		Map<Integer,Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	  System.out.println(collect);
	}
  
	
	public static void frequencyofElement(int[] arr){
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			 if(map.containsKey(arr[i])) {
				 map.put(arr[i], map.get(arr[i])+1);
			 }else {
				 map.put(arr[i], 1);
			 }
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
