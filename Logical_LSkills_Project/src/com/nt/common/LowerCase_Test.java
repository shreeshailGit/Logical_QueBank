package com.nt.common;

public class LowerCase_Test {

	public static void main(String[] args) {
		String str = "BRITISH";
		char[] cs = str.toCharArray();
		int val = 0;
		for(int i=0; i<=cs.length -1; i++) {
			
			if(cs[i] >= 65 && cs[i] <= 90) {
				val = (int)(cs[i] + 32);
			}
			char b = (char) val;
			System.out.print(b);
		}
	//	System.out.println(val.to);

	}

}
