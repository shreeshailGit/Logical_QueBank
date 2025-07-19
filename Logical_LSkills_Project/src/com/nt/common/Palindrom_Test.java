package com.nt.common;

public class Palindrom_Test {

	public static void main(String[] args) {
		int n = 454;
		int temp,r=0, sum=0;
		
		temp = n;
		
		while(n>0) {
			r = n % 10;
			sum = (sum*10) + r;
			n = n/10;
		}
     
		System.out.println(sum);
		if(temp == sum) {
			System.out.println("Number is Palindrom");
		}else {
			System.out.println("Number is not Palindrom");
		}
	}

}
