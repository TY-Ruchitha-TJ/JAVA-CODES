
package com.tyss.synchornized.programs;

public class TestDemo {
public static void main(String[] args) {
	Display disp=new Display();
	MyThread thread=new MyThread(disp, 10, "ruchi");
	MyThread thread1=new MyThread(disp, 20, "rachu");
	thread.start();
	thread1.start();
}
}

