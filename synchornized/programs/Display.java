package com.tyss.synchornized.programs;

public class Display {
	public synchronized void Wish(String name)  {
		for(int i=0;i<5;i++) {
			System.out.println("Good Afternoon");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(name);
	}//end of for loop

}
}
