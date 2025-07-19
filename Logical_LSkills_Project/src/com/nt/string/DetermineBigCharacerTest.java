package com.nt.string;

public class DetermineBigCharacerTest {

	public static void main(String[] args) {
		String st = "shreeshail";
		char c1= 'r'; char c2= 'i';
		
		if(st.lastIndexOf(c1) < st.lastIndexOf(c2))
		       System.err.println("True");
		   else
			   System.err.println("False"); 

	}

}
