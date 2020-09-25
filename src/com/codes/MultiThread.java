package com.codes;

class MultiThread {
	 public static void main(String args[]) {
	 new Threads("One"); // start threads
	 new Threads("Two");
	 new Threads("Three");
	 try {
	 // wait for other threads to end
	 Thread.sleep(10000);
	 } catch (InterruptedException e) {
	 System.out.println("Main thread Interrupted");
	 }
	 System.out.println("Main thread exiting.");
	 }
	}