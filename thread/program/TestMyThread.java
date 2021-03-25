package com.tyss.thread.program;

public class TestMyThread {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().isDaemon());
	//System.out.println(Thread.currentThread().setDaemon(true));
	System.out.println("thread priority"+Thread.currentThread().getPriority());
	MyThread thread=new MyThread();
	
	thread.start();
	thread.setPriority(1);
	
	
	System.out.println("threaMy Thread Priority"+thread.getPriority());
	//thread.start();
	//thread.run();
	//thread.run(5);
	System.out.println("print id"+thread.getId());
	System.out.println("print name"+thread.getName());
	thread.setName("Ruchi");
	System.out.println("print name"+thread.getName());
	thread.setName("Ruchi");
	for(int i=0;i<10;i++) {
	System.out.println("Main Thread");
	
	}
}
}
