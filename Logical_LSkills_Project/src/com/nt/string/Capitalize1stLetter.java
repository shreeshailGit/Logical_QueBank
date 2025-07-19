package com.nt.string;

public class Capitalize1stLetter {

	public static void main(String[] args) {
		String str = "my name is shreeshail vikram sarate";
		
		String[] words = str.split(" ");

		for(String word : words) {
		    String firstLetter = word.substring(0, 1).toUpperCase();	
		    String remaningLetter = word.substring(1);
	       System.out.print(firstLetter+remaningLetter+" ");
		}
		
	}

}
