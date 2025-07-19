package com.nt.string;

public class InterviewTest {

	public static void main(String[] args) {
		InterviewTest i1 = new InterviewTest();
		
		System.out.println(i1.m1());

	}
	
	public int m1() {
		try {
			return 1;
		}catch(Exception e) {
			return 2;
		}
		
		finally {
			return 3;
		}
	}

}
