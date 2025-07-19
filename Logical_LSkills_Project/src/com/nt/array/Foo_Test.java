package com.nt.array;

public class Foo_Test {

	public static void main(String[] args) {
		foo(15);
	}

	public static void foo(int a){
	 	System.out.print(a%10);   //5
	   if(a%10 != 0){
	       foo(a/10);
	   }
	    System.out.print(a%10); 
	}
}

