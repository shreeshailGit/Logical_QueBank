package com.nt.array;

import java.util.ArrayList;
import java.util.List;

public class AddConsecutiveEven_Test {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 4, 5, 2, 6, 3, 1};
		 
		 List<Integer> list = new ArrayList();

		 for(int i=0; i<arr.length; i++) {
			 if(i<arr.length-1 && arr[i] % 2==0 && arr[i+1] % 2==0) {
				 list.add(arr[i] + arr[i+1]);
				 i++;
			 }else {
				 list.add(arr[i]);
			 }
		 }
		 
		 int[] res = new int[list.size()];
		 for(int j=0 ; j<res.length; j++) {
			 res[j] = list.get(j);
		 }
		 
		 for(int i : res) {
			 System.out.print(i+" ");
		 }
		 
	}

}
