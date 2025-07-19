package com.nt.array;

import java.util.Arrays;

//6)Write a Java Program to find Min and Max elements in given Array?
public class MinNdMaxElemInArray {

	public static int getMax(int[] a ,int n) {
	     return Arrays.stream(a).max().getAsInt();	
	}
	
	public static int getMin(int[] a,int n) {
		 return Arrays.stream(a).min().getAsInt();	
	}
	
	public static void main(String[] args) {
		int a[] = {1, 2, 5, 5, 6, 6, 7, 2};
        int n = a.length;
		
        System.out.println("Max no. "+getMax(a,n));
        System.out.println("Min no. "+getMin(a,n));
        
        //
        System.out.println("-------------------------------------");
        Arrays.sort(a);
        System.out.println("Max no. "+a[a.length-1]);
        System.out.println("Min no. "+a[a.length-8]);
	}

}
