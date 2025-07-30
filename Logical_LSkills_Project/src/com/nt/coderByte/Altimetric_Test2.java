package com.nt.coderByte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Altimetric_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Find the group of anagrams in string array
		//String[] strArr ={"abc","god","cab", "bca", "dog","cat"}; 
		//Output : {"abc","cab", "bca"}{"god","dog"}{"cat"}
		
		String[] strArr ={"abc","god","cab", "bca", "dog","cat"}; 
		List<List<String>> results = isAnagramgrouped(strArr);
		
		for(List<String> g : results) {
			System.out.println(g);
		}
	}
	
	public static List<List<String>> isAnagramgrouped(String[] arr) {
		Map<String,List<String>> map = new HashMap<>();
		for(String word : arr) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);
			map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
		}
		return new ArrayList<>(map.values());
	}

}
