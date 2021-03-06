package com.tyss.list.programs;

	import java.util.Arrays;

	public class MyVector {
		 private static final int INITIAL_CAPACITY = 10;
		  private Object elementData[]={};
		  private int size = 0;
		 
		  /**
		  * constructor.
		  */
		  public MyVector() {
		    elementData = new Object[INITIAL_CAPACITY];
		  }
		 
		  /**
		   * method adds elements in VectorCustom.
		   */
		  public synchronized void add(Object e) {
		    if (size == elementData.length) {
		      ensureCapacity(); //increase current capacity of list, make it double.
		    } 
		    elementData[size++] = e;
		  }
		 
		 
		  /**
		   * method returns element on specific index.
		   */
		  @SuppressWarnings("unchecked")
		  public synchronized Object get(int index) {
		    //if index is negative or greater than size of size, we throw Exception.
		    if ( index <0 || index>= size) {  
		      throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		    }
		    return (Object) elementData[index]; //return value on index.
		  }
		 
		 
		  /**
		   * method returns removedElement on specific index.
		   * else it throws IndexOutOfBoundException if index is negative or greater than size of size.
		   */
		  public synchronized Object remove(int index) {
		    if ( index <0 || index>= size) {  //if index is negative or greater than size of size, we throw Exception.
		      throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		    }
		   
		    Object removedElement=elementData[index];
		    for(int i=index;i<size - 1;i++){
		       elementData[i]=elementData[i+1];
		    }
		    size--;   //reduce size of VectorCustom after removal of element.
		   
		    return removedElement;
		  }
		 
		 
		  /**
		   * method increases capacity of list by making it double.
		   */
		  private void ensureCapacity() {
		    int newIncreasedCapacity = elementData.length * 2;
		    elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
		  }
		 
		  /**
		   * method displays all the elements in list.
		   */
		  public void display() {
		      System.out.print("Displaying list : ");
		      for(int i=0;i<size;i++){
		             System.out.print(elementData[i]+" ");
		      }
		  }
		  public String toString() {
				String s1 = new String("[");
				for(int i=0;i<size;i++) {
					if(i==size-1) {
						s1 = s1 + elementData[i];
					}else {
						s1 = s1+elementData[i]+",";
					}
				}
				s1=s1+"]";
				return s1;
			}

}
