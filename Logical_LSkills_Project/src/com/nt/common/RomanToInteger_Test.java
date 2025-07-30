package com.nt.common;

public class RomanToInteger_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(romantoInt("X"));
	}

	public static int romantoInt(String s) {
		int result = 0;
		int prev=0;
		
		for(int i=s.length()-1; i >=0 ;i--) {
			int current = getValues(s.charAt(i));
		   if(current < prev) {
			   result  -=current;
		   }else {
			   result += current;
		   }
		}
		return result;
	}
	
	public static int getValues(char c) {
		switch(c) {
		case 'I' : return 1;
		case 'V' : return 5;
		case 'X' : return 10;
		case 'L' : return 50;
		case 'C' : return 100;
		case 'D' : return 500;
		case 'M' : return 1000;
		default : return 0;
		}
	}
}
