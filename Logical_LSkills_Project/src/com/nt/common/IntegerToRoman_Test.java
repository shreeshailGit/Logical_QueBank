package com.nt.common;

public class IntegerToRoman_Test {

	public static void main(String[] args) {
		/*System.out.println(getIntToRoman(39));//XXXIX
		System.out.println(getIntToRoman(49));//XLIX
		System.out.println(getIntToRoman(46));
		System.out.println(getIntToRoman(51));//LI
		*/		//System.out.println(getIntToRoman(50));//L
		//System.out.println(getIntToRoman(1000));//M
		//System.out.println(getIntToRoman(550));//DL

		System.out.println(getIntToRoman(150));
	}
	
	public static String getIntToRoman(int num) {
		// Arrays to store the Roman numerals and their corresponding integer values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = 
            {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<values.length ; i++) {
        	while(num >= values[i]) {
        		num -= values[i];
        		sb.append(romans[i]);
        	}
        }
        return sb.toString();
	}

}
