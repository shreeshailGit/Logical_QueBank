package com.nt.string;
//2) Write a java program to reverse each word of a String

import java.util.Arrays;
import java.util.stream.Collectors;

//input : java programming language
//output : avaj gnimmargorp egaugnal

public class ReverseEachWord {

	public static void main(String[] args) {
		 String str  = "java programming language";
		  
			/* String words[]=str.split(" ");   //  OR str.split("//s");
			 String reverseWord="";  
			 for(String w:words) {  
			     StringBuilder sb=new StringBuilder(w);  
			     sb.reverse();  
			     reverseWord+=sb.toString()+" ";  
			 }  
			  reverseWord.trim();  
			   System.out.println(reverseWord);*/
	 
		String reverseWord = Arrays.asList(str.split(" ")).stream().map(s->new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
				 System.out.println(reverseWord);
			
		
	}//main

}
