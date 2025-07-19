package com.nt.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
//very very important question
public class DuplicateElemInArrayRemoveduplicateElement {

	public static void main(String[] args) {
		/* int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};
		 int size  = arr.length; 
		 System.out.println("Repeated Elements are :");*/

	 // Solution 1 
	 //    HashSet<Integer> uniqueElem = new HashSet();
	 //    Set<Integer> duplicateElemnts = Arrays.stream(arr).filter(i-> !uniqueElem.add(i)).boxed().collect(Collectors.toSet());
	  //   System.out.println(duplicateElemnts);
	     
	     //Soultion 2
			/*  for(int i=0; i<size; i++) {
			 	    for(int j=1+i; j<size; j++) {
			 	    	 if(arr[i] == arr[j]) {
			 	    		 System.out.print(arr[i]+"  ");
			 	    	 }
			 	    }
			  }*/
		
		int arr[] = {1,2,2,3,4,4,4,5,5};
		for(int i=0 ; i<arr.length-1;i++) {
			if(arr[i] == arr[i+1] && i+1 <= arr.length-1) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
		
	}

}
