package com.nt.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class OccrenceOf_Character_WithSort_Test {

	public static void main(String[] args) {
			
		String str = "shreeshail";
		 Map<Character, Integer> freqMap = new TreeMap<>();

	        for (char ch : str.toCharArray()) {
	            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
	        }

	        // Print the characters and their frequencies
	        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	}

}
