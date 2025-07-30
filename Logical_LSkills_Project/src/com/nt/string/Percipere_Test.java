package com.nt.string;

public class Percipere_Test {

	public static void main(String[] args) {
		//String st  = "shreeshail sarate java interview";
		String st  = "I Love My India";
		String[] words = st.split(" "); 

		// rotate(words);
		for(int i=0 ; i<words.length; i++) {
			for(int j=i; j<words.length; j++) {
				System.out.print(words[j]+" ");
			}		
			for(int j = 0; j<i; j++ ) {
				System.out.print(words[j]+" ");
			}
			System.out.println();
		}
		
	}

}
