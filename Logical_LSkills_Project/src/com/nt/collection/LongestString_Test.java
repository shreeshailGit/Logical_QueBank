package com.nt.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class LongestString_Test {

	public static void main(String[] args) {
		String[] str = {"Apple","Banana","Chiku","PineApple","Orange","Graphes","WaterMelon"};
		
		String longestString = Arrays.stream(str).max(Comparator.comparing(String :: length)).get();
        System.out.println("longestString = "+longestString);
        
        List<String> strs = List.of("Apple","Banana","Chiku","PineApple","Orange","Graphes","WaterMelon");
        
        String lonString = strs.stream().max(Comparator.comparing(String :: length)).get();
	    System.out.println("longString = "+lonString);
	    
	    
	    Arrays.asList(str);
	}

}
