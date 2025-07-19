package com.nt.coderByte;

public class FirstFactorial_Test {

	public static void main(String[] args) {
		
		int num = 5;
		int tot = 1;
		
		for(int i=1; i<=num ; i++) { //i 1 2 3 4 5
			tot = tot * i;    //tot 120
		}
		
		System.out.println("First Factorial ="+tot);
		

	}

}
