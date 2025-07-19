package com.nt.exception;

public class Division_Test_Problem {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int c = a/b;
		
		System.out.println("Result:"+c);
		
		//case 1 while sending two values a=40 b=20 Result =2
		//case 2 both values are empty then Result - thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
	    //case 3 a=100 b=0  Result thread "main" java.lang.ArithmeticException: / by zero
		//case 4 a=100 b=a Result  thread "main" java.lang.NumberFormatException: For input string: "a"
	}

}
