package com.nt.stream;

public class Test1234 {

	public static void main(String[] args) {
		int [] arr={1,2,4,5,2,6,3,1};

		int length = arr.length;
		int tot = 0;
		for(int i=0; i<length-1; i++) {
			
			if(arr[i] % 2 == 0) {
				for(int j=i+1; j<length-1; j++) {
		            
					if(arr[j] % 2 == 0) {
				        arr[j] =  arr[i] + arr[j];		
					}else {
						break;
					}
				}
			}
		}
		for(int i : arr) {
		   System.out.print(i+" ");
		}
		
	}

}
