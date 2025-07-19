package com.nt.common;

import java.util.Arrays;

public class Anagram_Test {

	public static void main(String[] args) {

		System.out.println(isValid("Madam","damaM"));
	}
	
	public static boolean isValid(String s1,String s2) {
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();		
		
		char[] cs1 = s1.toCharArray();
		char[] cs2 = s2.toCharArray();
		
		if(cs1.length != cs2.length) {
			return false;
		}
		
		Arrays.sort(cs1);Arrays.sort(cs2);
		 boolean result = Arrays.equals(cs1, cs2);		
		 return  result;
	}

}
