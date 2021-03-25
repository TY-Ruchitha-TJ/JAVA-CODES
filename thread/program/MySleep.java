package com.tyss.thread.program;

public class MySleep  extends Thread{
	public static void main(String[] args) throws InterruptedException {
		System.out.print("R");
		Thread.sleep(3000);
		System.out.print("A");
		Thread.sleep(3000);
		
		System.out.print("C");
		Thread.sleep(3000);
		
		System.out.print("H");
		Thread.sleep(3000);
		
		System.out.print("U");
		Thread.sleep(3000);
	}

}
