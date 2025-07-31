package com.nt.string;

public class Percipere_Test {

	public static void main(String[] args) {
		String st  = "shreeshail sarate java interview";
		//String st  = "I Love My India";
		String[] words = st.split(" "); 
       int len = words.length;
		// rotate(words);
		/*for(int i=0 ; i<words.length; i++) {
			for(int j=i; j<words.length; j++) {
				System.out.print(words[j]+" ");
			}		
			for(int j = 0; j<i; j++ ) {
				System.out.print(words[j]+" ");
			}
			System.out.println();
		}*/
		
       for(int i=0; i<len; i++) {
    	   for(int j=0; j<len; j++) {
    		   System.out.print(words[(i+j) % len] +" ");
    	   }
    	   System.out.println();
       }
	}
	

	/*	  String s1 = new String("a");// Heap | SCP
		  String s2  = new String("a"); // Heap
		  String s3 = "a"; 
		  String s4 = "a";
	
		String s1 = new String("A");
		String s2 = new String("B");
		Sop(s1==s2);       false
		Sop(s1.equals(s2)); false
	
	
	
		String s1 = new String("A");
		s1.concat("B");
		String s2 = s1.concat("C");//AC
		s1=s1.concat("D");//AD	 
	*/

}
