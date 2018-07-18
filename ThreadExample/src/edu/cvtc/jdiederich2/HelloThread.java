package edu.cvtc.jdiederich2;

// Plain old object in Java
// To be able to run on a thread
// we implement the Runnable interface

public class HelloThread implements Runnable {

	// Many ways to implement threads.  One way is below.
	// Thread - Normally pass into thread class and implement that way. 
	private Thread t;
	private String threadName;
	
	
	// Create constructor
	HelloThread(String name) {
		this.threadName = name;
	}
	
	@Override
	public void run() {
		System.out.println("Running thread " + threadName);
		
		try {
		for(int i = 4; i > 0; i--) {
			System.out.println("Thread: " + threadName + ", " + i);
				Thread.sleep(50);
			}	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread " + threadName + " exiting.");
	}
	
	
	// Start thread
	public void start() {
		// Memorize thread
		if (null == t) {
			System.out.println("Starting thread " + threadName);
			t = new Thread(this, threadName); // Takes in object, this, and name
			t.start();
		}
	}
	
	public void join() throws InterruptedException {
		t.join();
	}

}
