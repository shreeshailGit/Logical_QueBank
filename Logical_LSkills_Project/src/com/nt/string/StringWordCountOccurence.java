package com.nt.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringWordCountOccurence {

	public static void main(String[] args) {
		// how many time word occurences
		/*String s="I am the good boy boy is good ";
			String arr[]=s.split(" ");
			int count=0;
		
			Map<String,Integer> map=new TreeMap<>();
			for (int i = 0  ; i <arr.length   ;i++ )
			{
				count=0;
				for (int j = 0  ;j<arr.length  ;j++ )
				{
					if (arr[i].equals(arr[j]))
					{
						count++;
					}
				}
				map.put(arr[i],count);
			}
			System.out.println(map);*/
		
		String str = "i love you the love is you";
			   HashMap< String,Integer> map = new HashMap<>();
				
				String words[] = str.split("");
				for(int i =0; i<words.length; i++) {
					if(map.containsKey(words[i])) {
						 int  count = map.get(words[i]);
					     map.put(words[i], count+1);
						}else {
							map.put(words[i],1);
						}
				}
				System.out.println(map);
		/*  int sum=0;
		int a[] = { 7, 4, 6, 3, 5, 2, 8, 1 };
		 Arrays.sort(a);
		 
		 for(int i=0; i<a.length; i++) {
		  System.out.print(a[i]+"  ");             
		  sum += a[i];
		 }
		 System.out.println();
		 System.out.println("Sum of all digits");
		 System.out.println(sum);
		 System.out.println("//////////////////////////////////////");
		
		   System.out.println("2nd Highest digit is :: "+a[a.length-2]);
		   
		   int l = a[a.length-8];
		   int h = a[a.length-1];
		   System.out.println("Max diff betWn two digits :: "+(h-l));
		*/

		/*	for (int i = 22; i <= 999; i++) {
				boolean f = false;
				String s = Integer.toString(i);
		
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) == '1') {
						f = true;
					}
				}//for	
					if (f) {
						f = false;
					} else {
						System.out.println(i);
					}
				
			}*/
			
	}// main

}// class
