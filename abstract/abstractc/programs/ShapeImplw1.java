package com.tyss.abstractc.programs;

public class ShapeImplw1 {
	public static void main(String[] args) {
		Shape s = () -> {
			System.out.println("drawing");
		};
		s.drawing();
				}

}
