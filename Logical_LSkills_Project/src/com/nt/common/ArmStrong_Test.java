package com.nt.common;

public class ArmStrong_Test {

	public static void main(String[] args) {
         System.err.println(isArmStrong(153));
	}
	
	public static String isArmStrong(int num) {
		int temp =num;
		int sum=0;
		int	r=0;
		while(num>0) {
			r = num % 10;
			sum = (r*r*r)+sum;
			num=num/10;
		}
		
		String result = null;
		if(temp == sum) {
			result = "Number is ArmStrong";
		}else {
			result = "Number is not ArmStrong";			
		}
		return result;
		
	}

}
