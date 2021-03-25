package com.tyss.thread.program;

public class MyPriority extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread"); 
			}
	}

}
