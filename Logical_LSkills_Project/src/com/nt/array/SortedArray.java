package com.nt.array;

public class SortedArray {

	public static void main(String[] args) {
		int[] arr = {8,2,5,3,1,9,6,7};
		
		int n = arr.length;
		int temp = 0;
		
		for(int i=0; i<n ; i++) {
			
			for(int j=i+1; j<n; j++) {
		         
				if(arr[i] > arr[j]) {
				   temp = arr[i];
				   arr[i] = arr[j];
				   arr[j] = temp;
				}
			}
		}
		
		for(int k=0; k<n; k++) {
			
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		System.out.println("3rd Higest element "+arr[arr.length-3]);
	}

}
