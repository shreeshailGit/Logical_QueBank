package com.nt.string;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Capgemini_Test {

	public static void main(String[] args) {
		String s = "TodayIsSaturday31stMay2025";

		/*Output- 
		Today Is Saturday
		Length = 26
		2025May31st
		31-05-2025*/
		
		
		System.out.println(s.substring(0,15));
		System.out.println("Length = "+s.length());
		LocalDate date = LocalDate.of(2025,05,31);
	
        System.out.println(date.getYear()+""+date.getMonth()+date.getDayOfMonth()+"st");
        
        System.out.println(LocalDate.of(2025, 05, 31));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatteddate = date.format(formatter);
        System.out.println(formatteddate);
	}

}
