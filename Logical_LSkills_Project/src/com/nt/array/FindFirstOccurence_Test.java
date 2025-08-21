package com.nt.array;

public class FindFirstOccurence_Test {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,2,7};
		int elem = 2;
       System.out.println(findFirstOccurence(arr, elem));		

	}
	public static int findFirstOccurence(int[] arr,int elem) {
		int firstIndex=-1;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == elem) {
				if(firstIndex == -1) {
					firstIndex = i;
				}else {
					return firstIndex;
				}
			}
		}
		return -1;
	}

}
