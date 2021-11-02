package com.tuan3.hw2.myrectangle;

public class MyPoint {

	private int x;
	private int y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double distance(int x, int y) {
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public double distance(MyPoint another) {
		int xDiff = this.x - another.getX();
		int yDiff = this.y - another.getY();
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public int[] getXY() {
		return new int[] { x, y };

	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
