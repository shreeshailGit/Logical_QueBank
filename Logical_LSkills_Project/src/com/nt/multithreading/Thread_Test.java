package com.nt.multithreading;

public class Thread_Test {
	
     public static void main(String[] args) {
			
		
    	 MyThread mt = new MyThread();
		mt.start();
		
			for(int i=0; i<10 ; i++) {
				System.out.println("Main Thread");
			}
	

	}

	
	
	

}

class MyThread extends Thread{
	
      public void run() {
		
		for(int i=0; i<10 ; i++) {
			System.out.println("run method");
		}
	}
	
	
}
