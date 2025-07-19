package com.nt.string;

import java.util.Map;
import java.util.stream.Collectors;

public class Find_Vowels {

	public static void main(String[] args) {
		String st = "Allena";
		int count = 0;
		
		for(int i=0; i<st.length(); i++) {
			if(st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u') {
				System.out.println("Given string contains "+st.charAt(i)+ " at the index "+i);
			   count++;
			}
		}
          System.out.println(count);
          
          Map<String, Long> duplcate = st.chars()
          .mapToObj(i -> (char) i)
          .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
          System.out.println(duplcate);
	}

}
