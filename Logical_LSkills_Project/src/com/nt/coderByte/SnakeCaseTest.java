package com.nt.coderByte;

public class SnakeCaseTest {

	public static void main(String[] args) {
	//	System.out.println(snakeCase("cats AND*Dogs-are Awesome"));
	//	System.out.println(snakeCase("a b c d-e-f%g"));

	}

	public static String snakeCase(String str) {
		
		    String s = str.toLowerCase();
		    
		    s = s.replace(" ", "_");
		    s = s.replace("-", "_");
		    s = s.replace("@", "_");
		    s = s.replace("#", "_");
		    s = s.replace("$", "_");
		    s = s.replace("%", "_");
		    s = s.replace("^", "_");
		    s = s.replace("&", "_");
		    s = s.replace("*", "_");
		
		    return s;
	}
}
