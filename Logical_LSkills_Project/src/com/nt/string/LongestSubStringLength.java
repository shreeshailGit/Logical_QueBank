package com.nt.string;

public class LongestSubStringLength {


	public static Boolean UniqueNo(String str , int i, int j) {
		boolean visited[]  = new boolean[256];
		
		for ( int k = i;  k<=j ; k++ ) {
			  if ( visited[str.charAt(k) ]  == true)
				   return false;
			    
			  visited[str.charAt(k)] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println( "longestsubstring length is "+longestSubStr("shreeshail")) ;
	}
	
	
	public static  int longestSubStr(String str) {
		int n = str.length();
		//Result
	  int res = 0;
	   for(int i=0 ;   i < n   ; i++ ) {
		   for(int j = i;  j < n  ;  j++ ) {
			     if(UniqueNo(str,i,j)) {
			    	 res = Math.max(res, j - i + 1);
			     }
		   }
	   }
	  return res;
	}


}
