package com.nt.array;

public class SummationOfintegers_Test {

	public static void main(String[] args) {
		String[] arr = {"10","20","30","abc","xyz","30","xxx","10"};
		 int sum = 0;
		for(String s : arr) {
			try {
			   
			    int val = Integer.parseInt(s);
		        sum +=val;
			} catch(NumberFormatException nfe) {
				 nfe.getMessage();
			}
		}
		System.err.println("Result = " +sum);

	}

}
