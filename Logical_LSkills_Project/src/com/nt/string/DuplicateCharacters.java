package com.nt.string;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String str = "Great responsibility";
		int count = 0;
		char[] cs = str.toCharArray();
		System.out.println(" Duplicate Characters are ::");
		for(int i=0; i<cs.length; i++) {
			 count = 1;
			
			for(int j=i+1; j<cs.length; j++){
				if(cs[i] == cs[j] && cs[i] != 0) {
					count++;
					cs[j] =0;
				}
			}//inner for loop
		  
			if(count > 1 && cs[i] !=0) {
				System.out.print(cs[i]+" ");
			}//r e t s i 
		}
		

	}

}
