package com.nt.stream;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

	public static void main(String[] args) throws InterruptedException {
        // Create an ExecutorService (thread pool)
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create Callable tasks
        Callable<Long> task1 = new FactorialCalculator(5);
        Callable<Long> task2 = new FactorialCalculator(10);
        Callable<Long> task3 = new FactorialCalculator(-3); // To demonstrate exception handling

        // Submit tasks to the ExecutorService and get Future objects
        Future<Long> future1 = executor.submit(task1);
        Future<Long> future2 = executor.submit(task2);
        Future<Long> future3 = executor.submit(task3);

        // Retrieve results from Future objects
        try {
            System.out.println("Factorial of 5 is: " + future1.get());
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error calculating factorial of 5: " + e.getMessage());
        }

        try {
            System.out.println("Factorial of 10 is: " + future2.get());
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error calculating factorial of 10: " + e.getMessage());
        }

        try {
            System.out.println("Factorial of -3: (Expecting Exception) ");
            System.out.println(future3.get()); // This will throw an ExecutionException
        } catch (ExecutionException e) {
            System.err.println("Error calculating factorial of -3: " + e.getCause().getMessage()); // Get the actual cause
        } finally {
            // Shut down the ExecutorService
            executor.shutdown();
        }

	}

}

//Implementing Callable to calculate factorial
class FactorialCalculator implements Callable<Long> {
 private int number;

 public FactorialCalculator(int number) {
     this.number = number;
 }

 @Override
 public Long call() throws Exception {
     if (number < 0) {
         throw new IllegalArgumentException("Number must be non-negative.");
     }
     long result = 1;
     for (int i = 1; i <= number; i++) {
         result *= i;
         Thread.sleep(100); // Simulate some work
     }
     return result;
 }
}
	