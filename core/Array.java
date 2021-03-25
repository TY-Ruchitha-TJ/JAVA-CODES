package com.tyss.corejava.test;

public class Array {
public static void main(String[] args) {
	//int []a=new int[4]
	//int a[]=new int[4]
	//int[] a=new int[4];
//	a[0]=2;
//	a[1]=5;
//	a[2]=6;
//	a[3]=9;
	int[] a= {4,5,7,8};
	
//	System.out.println(a[0]);
//	System.out.println(a[1]);
//	System.out.println(a[2]);
//	System.out.println(a[3]);
//	for (int i=0;i<a.length;i++) {
//		System.out.println(i);
//	}
	
	for (int arr:a) {
		System.out.println(arr);
	}
}
}
