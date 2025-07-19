package com.nt.stream;

import java.util.Arrays;
import java.util.List;

public class SumEvenNumbers_Test {

	public static void main(String[] args) {
        // Create a list of integers from 1 to 10
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use the Stream API to filter even numbers and compute their sum
        int sumOfEvens = numbers.stream()
                                .filter(num -> num % 2 == 0) // Filter even numbers
                                .mapToInt(Integer::intValue) // Convert to int
                                .sum(); // Sum the numbers

        // Print the result
        System.out.println("Sum of even numbers: " + sumOfEvens);
    }
}
