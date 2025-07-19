package com.nt.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GenerateRandom_String {

	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();
		
		//IntStream().range(0,6).mapToObj(i -> String.valueOf(str.charAt(random.nextInt(str.length())))).collect(Collectors.joining());

		String randomSubr = Stream.generate(
				                            () -> String.valueOf(
				                            		               str.charAt(
				                            		            		       random.nextInt(
				                            		            		    		            str.length()))))
				                  .limit(6).collect(Collectors.joining());
		
		System.out.println(randomSubr);
		
		/*String s = "shreeshail is java developer shreeshail is java developer";	
		Map<String, Long> wordCount = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(wordCount);*/

	        String collect = Stream.generate(() -> String.valueOf(str.charAt(random.nextInt(str.length())))).limit(6).collect(Collectors.joining());
	    System.err.println(collect);
	}

}
