package com.nt.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount_Test {

	public static void main(String[] args) {
        String s = "shreeshail is java developer shreeshail is java developer";

        // Split the string into words, convert to a stream, and count occurrences
        Map<String, Long> wordCount = Arrays.stream(s.split(" ")) // Split the string into words
                                            .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        // Print the word count
        wordCount.forEach((word, count) -> 
            System.out.println("Word: " + word + ", Count: " + count)
        );
    }
}

//avg sal of each dept 
//5h highest
