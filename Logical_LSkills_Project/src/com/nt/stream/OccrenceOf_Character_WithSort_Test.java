package com.nt.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
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

		System.out.println("-------------------------------------------------------------------------------");
		// output has key wise ascedning order
		String words = "sandesh";
		TreeMap<Character, Long> sortedMap = words.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
		System.out.println(sortedMap);

		// fetch Top 3 highest characters
		LinkedHashMap<Character, Long> linkedHashMap = words.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		linkedHashMap.entrySet().stream().sorted(Map.Entry.<Character, Long>comparingByValue().reversed()).limit(3)
				.forEach(entry -> System.out.println("Top Character :  " + entry.getKey() + " - " + entry.getValue()));

		
		System.out.println("*****************");
		//
		String s = "shreeeshail";

		Map<Character,Long> collect =
		s.chars().mapToObj(c -> Character.toLowerCase((char) c) )
		         .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new,Collectors.counting()));

		collect.entrySet().stream().sorted(Map.Entry.<Character,Long>comparingByValue().reversed())
        .limit(3).forEach(entry -> System.out.println("3rd most repeated char :: "+entry.getKey()+" - "+entry.getValue() ));;

        System.out.println("*****************");
				collect.entrySet().stream().sorted(Map.Entry.<Character,Long>comparingByValue().reversed())
				                  .skip(2).limit(1).forEach(entry -> System.out.println("3rd most repeated char ::: "+entry.getKey()+" - "+entry.getValue() ));;
			}

}
