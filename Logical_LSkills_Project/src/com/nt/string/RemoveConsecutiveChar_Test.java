package com.nt.string;

public class RemoveConsecutiveChar_Test {

	public static void main(String[] args) {
		String s = "leeetcode";
		System.err.println(makeFancyString(s));

	}

	public static String makeFancyString(String s) {
	    StringBuilder sb = new StringBuilder();
	    for (char c : s.toCharArray())
	      if (sb.length() < 2 || sb.charAt(sb.length() - 1) != c || sb.charAt(sb.length() - 2) != c)
	        sb.append(c);//l e 
	    return sb.toString();
	  }
}
