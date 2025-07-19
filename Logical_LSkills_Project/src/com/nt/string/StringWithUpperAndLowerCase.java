package com.nt.string;

public class StringWithUpperAndLowerCase {

	public static void main(String[] args) {
		
	/*	String s1  = new String("telerik");

		String s2 = s1.toLowerCase();
		String s3 = s1.toUpperCase();
		//when new String obj will create or not
		//case 1
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);*/
		
		String s1 = "telerik";
		
		String s2 = s1.toString();
		String s3 = s1.toLowerCase();
       String s4 = s1.toUpperCase();
       
        System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		
	}

}
