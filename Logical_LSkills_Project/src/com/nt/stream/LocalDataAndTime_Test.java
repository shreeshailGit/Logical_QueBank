package com.nt.stream;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDataAndTime_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current Local Date :: "+LocalDate.now());
		/*SimpleDateFormat sf = new SimpleDateFormat("dd/MM/YYYY");
		String string = sf.format(LocalDate.now());
		System.out.println(string);*/
		
		System.out.println("Current Local Time :: "+LocalTime.now());
		
		System.out.println("Current Local Date And Time :: "+LocalDateTime.now());
		
		
		

	}

}
