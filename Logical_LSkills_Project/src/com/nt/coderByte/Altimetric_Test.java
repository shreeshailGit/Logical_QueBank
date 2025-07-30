package com.nt.coderByte;

public class Altimetric_Test {

	
	public static void rotate(int[] arr,int k) {
	
		//reverse(arr,0,arr.length-1);
		for(int i=0; i< arr.length-1; i+=k) {
			int left = i;
			int right = Math.min(i+k-1, arr.length-1);
			reverse(arr,left,right);
		}
		
		//reverse(arr,k,arr.length-1);
	}
	
	public static void main(String[] args) {
		//Reverse every subarray formed by consecutive K
		//element input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9,10,11],
		//K = 3 
		//Output: 3, 2, 1, 6, 5, 4, 9, 8, 7,11,10
			
		 int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11};
		 System.out.println("Original Array");
		 
		 for(int k : arr) {
	        	System.out.print(k+" ");
	        }
		 System.out.println();
		 int k = 3;
		 rotate(arr,k);
		 System.out.println("After rotation");
		 
        for(int m : arr) {
        	System.out.print(m+" ");
        }
	}
	
	public static void reverse(int[] arr, int start,int end) {
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]  = temp;
			
			start++;
			end --;
		}
	}

}
