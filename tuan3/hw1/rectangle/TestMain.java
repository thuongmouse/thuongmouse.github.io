package com.tuan3.hw1.rectangle;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1 = new Rectangle(1.2f , 3.4f);
		System.out.println(rectangle1);
		Rectangle rectangle2 = new Rectangle();
		System.out.println(rectangle2);
		
		rectangle1.setLength(5.6f);
		rectangle1.setWidth(7.8f);
		System.out.println(rectangle1);
		System.out.println("length is: "+ rectangle1.getLength());
		System.out.println("width is: "+ rectangle1.getWidth());
		
		System.out.println("area is: "+ rectangle1.getArea());
		System.out.println("perimeter is: "+ rectangle1.getPerimeter());
		
		

	}

}
