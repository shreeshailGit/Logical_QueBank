package com.nt.array;

import java.util.Arrays;

public class AdditionUniqNum {

	public static void main(String[] args) {
		 int  arr[] =	{1, 6, 4, 3, 2, 2, 3, 8, 1};   //1,6,4,3,2,8
			 int n = arr.length;
			// int sum = 0;
			 int sum = arr[0];
			 Arrays.sort(arr);
			 
			 for(int i=0; i<n-1; i++) {
				 
				 if(arr[i] != arr[i+1]) {
					 sum += arr[i+1];
				 }
			 }
			 System.out.println("Result = "+sum);
				 

	}

}
