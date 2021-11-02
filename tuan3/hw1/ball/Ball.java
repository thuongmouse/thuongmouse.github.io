package com.tuan3.hw1.ball;

public class Ball {
	private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        setX(getX() + getxDelta());
        setY(getY() + getyDelta());
    }

    public void reflectHorizontal() {
        setxDelta(-getxDelta());
    }

    public void reflectVertical() {
        setyDelta(-getyDelta());
    }

    public String toString() {
        return "Ball[(" + getX() + ", " + getY() + "), speed=(" + getxDelta() + ", " + getyDelta() + ")]";
    }
}
