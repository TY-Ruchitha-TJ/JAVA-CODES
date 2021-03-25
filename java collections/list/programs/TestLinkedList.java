package com.tyss.list.programs;

public class TestLinkedList {

		public static void main(String[] args){
			 CustomLinkedList customLinkedList = new CustomLinkedList();
		     customLinkedList.insert(59);
		     customLinkedList.insert(56);
		     customLinkedList.insert(15);
		     customLinkedList.insert(97);
		     customLinkedList.display();
		    
		     System.out.println("Custom linked list");
		     customLinkedList.display();
		     System.out.println("My Linked list");
		     customLinkedList.deleteNodeAt(2);
		     customLinkedList.display();
		     System.out.println("****");
		     customLinkedList.insertHead(50);
		     customLinkedList.display();
		 }
}
