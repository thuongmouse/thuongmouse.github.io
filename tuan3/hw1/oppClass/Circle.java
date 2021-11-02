package oppClass;

public class Circle {
	private double radius;
	private String color;

	public Circle() {
		radius = 1.0;
		color = "red";

	}

	/*
	  public Circle(double r) {
	      radius = r; color = "red"; 
	  }
	   public Circle(double r, String c) {
	   . radius = r; color = c; } // 1.
	 */
	public Circle(double radius) { // 5.
		this.radius = radius;
		color = "red";
	}

	public Circle(double radius, String color) { // 5.
		this.radius = radius;
		this.color = color;
	}

	public String getColor() { // 2
		return color;

	}
	public void setRadius(double radius) {
		this.radius = radius; 
		
	}

	public void setColor() { // 5
		this.color = color;

	}

	public double geRadius() {
		return radius;

	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
	/*public void setRadius(double newRadius) {
            radius = newRadius;
    }
     public void setColor(String newColor) {
          color = newColor;
     }*/
	public String toString() {
        return "Circle[radius = " + radius + " color = " + color + "]";
    }

	

}
