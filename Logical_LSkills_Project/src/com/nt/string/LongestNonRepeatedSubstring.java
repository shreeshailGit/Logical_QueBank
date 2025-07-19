package com.nt.string;

public class LongestNonRepeatedSubstring {

	public static void main(String[] args) {
		//geeksforgeeks
		 //ksforge 
		System.out.println( "longestsubstring length is "+longestUniqueSubStr("geeksforgeeks")) ;

	}
	
	

	public static  int longestUniqueSubStr(String str) {
		int n = str.length();
		//Result
	  int res = 0;
	   for(int i=0 ;   i < n   ; i++ ) {
		   for(int j = i;  j < n  ;  j++ ) {
			     if(areDistinct(str,i,j)) {
			    	 res = Math.max(res, j - i + 1);
			     }
		   }
	   }
	  return res;
	}

	public static Boolean areDistinct(String str , int i, int j) {
		boolean visited[]  = new boolean[256];
		
		for ( int k = i;  k<=j ; k++ ) {
			  if ( visited[str.charAt(k) ]  == true)
				   return false;
			    
			  visited[str.charAt(k)] = true;
		}
		return true;
	}

}
