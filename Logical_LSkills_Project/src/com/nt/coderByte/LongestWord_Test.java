package com.nt.coderByte;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestWord_Test {

	public static void main(String[] args) {
           System.out.println(longestWord("shreeshail!! vikram123 456sarate"));
		 //System.out.println(longestWord("Hello world123 567"));
           
           String c = "alester12345";
     //      Pattern pt = Pattern.compile("[^a-zA-Z0-9]");
     //      Pattern pt = Pattern.compile("[^a-z^A-Z^0-9]");
           Pattern pt = Pattern.compile("[^a-z^A-Z]");
           
           Matcher match= pt.matcher(c);
           while(match.find())
           {
               String s= match.group();
           c=c.replaceAll("\\"+s, "");
           }
           System.out.println(c);
	}

	public static String longestWord (String sen) {
		String[] words = sen.split("[^a-z^A-Z]");
		/*for(String s : words) {
			System.out.println(s);
		}*/
		
		int longestlength = 0;
		String result = "";
		for(int i=0; i< words.length; i++) {
			if(words[i].length() > longestlength) {
				result =words[i];
				longestlength = words[i].length() ; 
			}
		}
		
		return result;
	}
}
