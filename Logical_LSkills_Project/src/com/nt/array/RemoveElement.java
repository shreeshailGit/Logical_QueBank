package com.nt.array;

public class RemoveElement {

	public static void main(String[] args) {
	//int[] nums= {3,2,2,3};
		int[] nums= {0,1,3,2,2,3,4,2};
		int val = 2;
	System.err.println(removeElement(nums,val));
	 

	}
 
	public static int removeElement(int[] nums,int val) {
		  int counter = 0;
		for(int i=0; i<nums.length; i++) {
		   if(nums[i] != val) {
		 	    nums[counter] = nums[i];
		      counter++;  
		   }
		}
		return counter;
	}
	

}
