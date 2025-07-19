package com.nt.common;

public class FibonacciSeries_Test {
   
    
	public static void main(String[] args) {
		 int a=0; int b= 1;
		 
		for(int i=0; i<10; i++) {
			System.out.print(a+" ");
			/*int c = a+b;
			a = b;
			b = c;*/
			
			b = a+b;//1
			a = b-a;//0
		}
		//b = a+b;//1
		//a = b-a;//0
		//i=0  a=0 b=0+1=1  a=1-0=1    Print 0
		//i=1  a=1 b=1+1=2  a=2-1=1    Print 1
		//i=2  a=1 b=1+2=3  a=3-1=2    Print 1
		//i=3  a=2 b=2+3=5  a=5-2=3    Print 2
		//i=4  a=3 b=3+5=8  a=8-3=5    Print 3
		
		
		
	}

}
