package com.tuan3.hw2.mypoint;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint point1 = new MyPoint(3, 4);
		System.out.println(point1.distance(5, 6));
		MyPoint point2 = new MyPoint(5, 6);
		System.out.println(point1.distance(point2));

		MyPoint point = new MyPoint();
		System.out.println(point);
		point.setX(8);
		point.setY(6);
		System.out.println("x is: " + point.getX());
		System.out.println("y is: " + point.getY());
		point.setXY(3, 0);
		System.out.println(point.getXY()[0]);
		System.out.println(point.getXY()[1]);
		System.out.println(point);

		MyPoint[] points = new MyPoint[10];
		for (int i = 0; i < points.length; i++) {
			points[i] = new MyPoint((i + 1), (i + 1));
		}
		for (MyPoint p : points) {
			System.out.println("Distance between p1" + point1 + " and p" + p + " is " + point1.distance(p));
		}

	}

}
