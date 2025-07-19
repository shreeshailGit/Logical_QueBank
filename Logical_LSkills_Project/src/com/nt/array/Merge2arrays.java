package com.nt.array;

import java.util.Arrays;

public class Merge2arrays {

	public static void main(String[] args) {
		 int array1[] = {10,15,20,25,30};
		 int array2[] = {5,9,17,27,35};
		 
		 int[] finalArray = new int[array1.length + array2.length];
		
		 //src,srcPos.dest,destPos,length
		 System.arraycopy(array1, 0, finalArray, 0, array1.length);
		 System.arraycopy(array2, 0, finalArray, array1.length, array2.length);
		 
		 Arrays.sort(finalArray);
		 //Merged Arrays are
		 System.out.println("Merged Arrays are :");
		 
		 for(int i: finalArray) {
			 System.out.print(i+" ");
		 }

	}

}
