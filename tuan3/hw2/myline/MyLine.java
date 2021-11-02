package com.tuan3.hw2.myline;

public class MyLine {
	private MyPoint begin;
	private MyPoint end;

	public MyLine(MyPoint begin, MyPoint end) {
		this.begin = begin;
		this.end = end;
	}

	public MyLine(int x1, int y1, int x2, int y2) {
		begin = new MyPoint(x1, y1);
		end = new MyPoint(x2, y2);
	}

	public MyPoint getBegin() {
		return begin;
	}

	public MyPoint getEnd() {
		return end;
	}

	public void setBegin(MyPoint begin) {
		this.begin = begin;
	}

	public void setEnd(MyPoint end) {
		this.end = end;
	}

	public int getBeginX() {
		return begin.getX();
	}

	public int getBeginY() {
		return begin.getY();
	}

	public int getEndX() {
		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}

	public void setBeginX(int x) {
		begin.setX(x);
	}

	public void setBeginY(int y) {
		begin.setY(y);
	}

	public void setBeginXY(int x, int y) {
		begin.setXY(x, y);
	}

	public int[] getBeginXY() {
		return begin.getXY();

	}

	public void setEndX(int x) {
		end.setX(x);
	}

	public void setEndY(int y) {
		end.setY(y);
	}

	public void setEndXY(int x, int y) {
		end.setXY(x, y);
	}

	public int[] getEndXY() {
		return end.getXY();
	}

	public int getLength() {
		int xDiff = getEndX() - getBeginX();
		int yDiff = getEndY() - getBeginY();
		return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public double getGradient() {
		int xDiff = getEndX() - getBeginX();
		int yDiff = getEndY() - getBeginY();
		return Math.atan2(yDiff, xDiff);
	}

}
