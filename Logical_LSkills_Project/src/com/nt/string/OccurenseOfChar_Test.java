package com.nt.string;

public class OccurenseOfChar_Test {

	public static void main(String[] args) {
		String input  = "hello world";
		int[] freq = new int[256]; 

		for(int i=0; i<input.length(); i++) {
			freq[input.charAt(i)]++;
		}
		
		for(int i=0; i<freq.length; i++) {
			if(freq[i] > 0)
			System.out.println((char) i + " : "+freq[i]);
		}
		
	}

}
