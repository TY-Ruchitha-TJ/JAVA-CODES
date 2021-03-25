
package com.tyss.queue.program;

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorQueue {
	public static void main(String[] args) {
		PriorityQueue pq=new  PriorityQueue();
		pq.offer(56);
		pq.offer(9);	
		pq.offer(35);
		pq.offer(98);
		pq.offer(6);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.remove(6));
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		
	}

}
