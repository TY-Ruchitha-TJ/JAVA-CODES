package com.tyss.thread.program;

public class MyRunnable implements Runnable{
@Override
public void run() {
	for(int i=0;i<5;i++) {
	System.out.println("Inside run() method");
}
}//end of run()
}//end of class
