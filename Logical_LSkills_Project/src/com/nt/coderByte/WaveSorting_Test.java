package com.nt.coderByte;

import java.util.Arrays;

public class WaveSorting_Test {

	public static void main(String[] args) {
		//int[] arr = {0, 1, 2, 4, 1, 4};
		int arr[] = {10, 90, 49, 2, 1, 5, 23}; 
		int n = arr.length;
		Arrays.sort(arr);
		
		
		for (int i=0; i<n-1; i += 2) 
            swap(arr, i, i+1); 
		
	    for(int i: arr) {
	    	System.out.print(i+" ");
	    }
	}
	
	public  static void swap(int arr[],int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b] ;
	    arr[b] = temp;
	}

	
}
