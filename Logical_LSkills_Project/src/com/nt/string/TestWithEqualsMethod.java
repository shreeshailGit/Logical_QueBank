package com.nt.string;

import java.util.Scanner;
// trim() and toLowerCase() best example
public class TestWithEqualsMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your city name ::");
		String str  = sc.nextLine().toLowerCase().trim();

		if (str.equals("hyderbad")) {
			System.out.println("Hello hyderbadi , Aadaab");
		} else if (str.equals("chennai")) {
			System.out.println("Hello chennai , Vannakam");
		} else if (str.equals("banglore")) {
			System.out.println("Hello Kanndiga , Namkaram");
		}else {
			System.out.println("Please Enter Valid city name ");
		}
		
	}

}
