package com.nt.string;

import java.util.Arrays;
import java.util.List;

public class FormattingStringList {

	public static void main(String[] args) {
		List  list = Arrays.asList("SHREESHAIL VIKRAM SARATE","DARAPPA VIKRAM SARATE","MOHINI VIKRAM SARATE",
                "SUREKHA VIKRAM SARATE","KAVITA VIKRAM SARATE");

        System.out.println("Original list :"+list);System.out.println();

        //case 1
        Object[] array = list.toArray();
	    for(int i=0; i<list.size(); i++) {
	    	int j = i + 1;
	    	System.out.println(j+ " "+array[i]);
	    }
	    System.out.println();
	    //case 2
	    System.out.println("1st element "+list.get(0));System.out.println();
	    
	    //case 3
	    String text = list.toString().replace("[", "").replace("]", "");
	           text = text.replace(",", "\n -");
	    System.out.println(text);
	    
	    //testing purpose added
		/* String st = null ;  	 
		 System.out.println(st.trim());*/
	    
	}

}
