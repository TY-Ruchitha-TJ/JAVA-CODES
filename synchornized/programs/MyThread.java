package com.tyss.synchornized.programs;

public class MyThread extends Thread{
	Display d;
	String name;
	int id;
	
	public MyThread(Display d, int id, String name) {
		this.d = d;
		this.id = id;
		this.name=name;
	}
	@Override
	public void run() {
		d.Wish(name);
	}

}
