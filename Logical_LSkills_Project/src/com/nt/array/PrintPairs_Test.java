package com.nt.array;

public class PrintPairs_Test {

	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 5, 7, 8, 9 };
		int sum=7;
		
		for(int i=0; i<arr.length; i++) {
			int first=arr[i];
			for(int j=0; j<arr.length; j++) {
				int second=arr[j];
				if( (first + second) == sum) {
					System.out.print("("+first+","+second+")");
				}
			}
		}

	}

}
