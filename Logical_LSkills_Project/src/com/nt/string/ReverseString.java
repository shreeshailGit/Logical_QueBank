package com.nt.string;
//1) Write a java program to reverse a String without using reverse() method.

//Input : tekleads
public class ReverseString {

	public static void main(String[] args) {
	  String str = "Naresh";
	  
	  //Using reverse() method
		/*	 StringBuilder sb = new StringBuilder(str);
			  StringBuilder reverse = sb.reverse();
			      System.out.println(reverse);*/
	  
	  //Using for loop
		/*for(int i = str.length(); i>0;i--) {
		  System.out.print(str.charAt(i-1));
		}*/
	  
	  //With inbuilt charAt() method
		 String reverse = "";
		 for(int i=str.length()-1; i>=0;i--) {
		    reverse +=str.charAt(i);
		 }
		 System.out.println(reverse);
	  
	}//main

}//class
