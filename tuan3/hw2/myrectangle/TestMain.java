package com.tuan3.hw2.myrectangle;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint point1 = new MyPoint(1, 3);
		MyPoint point2 = new MyPoint(5, 8);
		MyRectangle rectangle1 = new MyRectangle(point1, point2);
		System.out.println(rectangle1); 
		MyRectangle rectangle2 = new MyRectangle(8,6,10,14); 
		System.out.println(rectangle2);
		System.out.println(rectangle1.getPerimeter());
		System.out.println(rectangle2.getArea()); 
	}

}
