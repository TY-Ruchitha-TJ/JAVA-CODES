package com.tyss.thread.program;

public class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("child thread"); 
		}
	}
		public void run(int i) {
			for(int j=0;i<10;i++) {
				System.out.println("another run method");
		}
			
	}
//		@Override
//		public void start() {
//			System.out.println("It is start method");
//		}

}
