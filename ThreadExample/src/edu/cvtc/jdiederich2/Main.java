package edu.cvtc.jdiederich2;

public class Main {

	// The main thread
	public static void main(String[] args) {
		
		// Two other threads
		HelloThread threadOne = new HelloThread("Hello-1");
		threadOne.start();
		
		HelloThread threadTwo = new HelloThread("Hello-2");
		threadTwo.start();
		
		HelloThread threadThree = new HelloThread("Hello-3");
		threadThree.start();
		
		HelloThread threadFour = new HelloThread("Hello-4");
		threadFour.start();
		
		try {
			threadOne.join();
			threadTwo.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
