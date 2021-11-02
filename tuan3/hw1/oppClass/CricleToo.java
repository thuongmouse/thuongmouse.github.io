package oppClass;

public class CricleToo {
	private double radius;

	public CricleToo() {
		radius = 1.0;

	}

	public CricleToo(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getCircumference() {
		return 2 * radius * Math.PI;
	}
	public String toString() {
		return "Circle[radius = " +radius+ "]";
	}

}
