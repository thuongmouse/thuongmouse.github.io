package oppClass;

public class TestMain {
	public static void main(String[] args) {
		CricleToo circle1 = new CricleToo(1.1);
		System.out.println(circle1);
		CricleToo circle2 = new CricleToo();
		System.out.println(circle2);

		circle1.setRadius(2.2);
		System.out.println(circle1);
		System.out.println("radius is: " + circle1.getRadius());

		System.out.printf("area is: %.2f%n", circle1.getArea());
		System.out.printf("circumference is: %.2f%n", circle1.getCircumference());

	}
}
