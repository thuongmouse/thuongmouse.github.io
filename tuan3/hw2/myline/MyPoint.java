package com.tuan3.hw2.myline;

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

	public int[] getXY() {
		return new int[] { x, y };

	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;

	}

}
