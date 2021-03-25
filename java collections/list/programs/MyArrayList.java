package com.tyss.list.programs;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements Iterable<E> {
	private Object eleData[];
	private final int DEF_SIZE = 5;
	private int size = 0;

	MyArrayList() {
		this.eleData = new Object[DEF_SIZE];
		
	}

	public void increaseSize(Object el) {
		System.out.println("method called");
		if(size == DEF_SIZE) {
			System.out.println("inside if block");
			System.out.println("size is "+size);
			int prevsize = eleData.length;
			System.out.println("prev size "+prevsize);
			int newSize = (prevsize*2);
			System.out.println("new size "+newSize);
			eleData = Arrays.copyOf(eleData, newSize);
			
		}
		this.eleData[size] = el;
		size++;
	}
	//remove method
	 public Object remove(int index) {
		    if ( index <0 || index>= size) {  
		      throw new ArrayIndexOutOfBoundsException("Index out of bound exception. Please provide valid index");
		    }
		    865
		    Object removedElement=eleData[index];
		    for(int i=index;i<size - 1;i++){
		    	eleData[i]=eleData[i+1];
		    }
		    size--;   
		    return removedElement;
		  }
	 
	
	@Override
	public String toString() {
		String s = new String("[");
		for(int i = 0; i<size;i++) {
			if (i == size - 1) {
				s = s + eleData[i];
			} else {
				s = s+eleData[i]+", ";
			}
		}
		s = s+"]";
		return s;
	}
	
	//own iterator implementation
	public Iterator<E> iterator(){
		return new Itr();
		
	}
	
	private class Itr<E> implements Iterator<E>{
		private int index;
		
		public boolean hasNext() {
			return(index<size)? true : false;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			E e=(E) eleData[index];
			index++;
			return e;
		
		}
		
	 
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}//end of Next()

	
	}//end of class 


