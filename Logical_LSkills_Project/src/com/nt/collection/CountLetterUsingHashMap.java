package com.nt.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountLetterUsingHashMap {

	public static void main(String[] args) {
		String str ="lshreeeshail";
		HashMap<Character,Integer> hm = new HashMap();	
		for(int i=0; i<str.length();i++) {
			
			if(hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}else {
				hm.put(str.charAt(i), 1);
			}
		}		
		System.out.println("Counting Letters");
		System.out.println(hm);
		
		Map<Character, Long> collect = str.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		/*String str = "I love my IndIa";
		str = str.replace(" ", "");
		System.out.println(str);
		char[] arr = str.toCharArray();
		int count= 0;
		HashMap map= new HashMap<>();
		for(char c : arr) {
			if(map.containsKey(c)) {
				map.put(c, count+1);
			}else {
				map.put(c, 1);	
			}
		}
				System.out.println(map);*/

	}

}
