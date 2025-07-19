package com.nt.stream;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacer {

	public static void main(String[] args) {
		String st = "shreeshail";
		
		//First non repeated charcter
		Character cha = st.chars().mapToObj(c -> Character.toLowerCase((char) c))
		          .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		          .entrySet()
		          .stream()
		          .filter(entry -> entry.getValue() == 1l)
		          .map(entry -> entry.getKey())
		          .findFirst()
		          .get();
		System.out.println("First non repeated characer :"+cha);
		
	
		        String input = "abc123!@#"; // Example input

		        Optional<Character> firstNonCharacter = input.chars()
		            .mapToObj(ch -> (char) ch) // Convert each character to Character object
		            .filter(ch -> !Character.isLetter(ch)) // Filter out non-letter characters
		            .findFirst(); // Get the first non-character

		        // Print the result
		        if (firstNonCharacter.isPresent()) {
		            System.out.println("First non-character: " + firstNonCharacter.get());
		        } else {
		            System.out.println("No non-characters found.");
		        }
		

		
		//First  repeated charcter
			/*	Character chr = st.chars().mapToObj(c -> Character.toLowerCase((char) c))
				          .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				          .entrySet()
				          .stream()
				          .filter(entry -> entry.getValue() > 1l)
				          .map(entry -> entry.getKey())
				          .findFirst()
				          .get();
				System.out.println("First repeated characer :"+chr);*/

	}

}
