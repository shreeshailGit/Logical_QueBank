package com.nt.coderByte;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		System.out.println(powerOfTwo(32));
	}

	public static boolean powerOfTwo(int num) {	
		if(num<=1)  return true;
				
		while(num%2==0) {
			num = num/2;
		}
		
		if(num == 1) {
			return true;
		}else {
			return false;
		}
	}//method
}
