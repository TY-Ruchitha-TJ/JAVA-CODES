package com.tyss.thread.program;

public class TestRunnable {
public static void main(String[] args) {
	MyRunnable runnable=new MyRunnable();
	Thread thread=new Thread(runnable);
	thread.start();
}
}
