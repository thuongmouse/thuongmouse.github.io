package oppClass;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Circle cricle1 = new Circle();
      System.out.println("The cricle has radius of "+ cricle1.geRadius()+" and area of "+ cricle1.getArea());
      
      Circle cricle2 = new Circle(2.0);
      System.out.println("The cricle has radius of "+ cricle2.geRadius()+" and area of "+ cricle2.getArea());
      
      Circle circle3 = new Circle(2.0, "blue");
      System.out.println("The circle has radius of " + circle3.geRadius() + " and area of " + circle3.getArea());
      // 2.
      System.out.println("This circle has the color " + circle3.getColor());
      // 3.
      /*System.out.println(circle1.radius);
      circle1.radius = 5.0;*/ // 'radius' has private access, means that they can only be accessed from the class where they are declared, hence the error.
      // 4.
      Circle circle4 = new Circle();
      circle4.setRadius(5.5);
      System.out.println("radius is: " + circle4.geRadius());
      circle4.setColor();
      System.out.println("color is: " + circle4.getColor());
      // 5. See Circle.java
      // 6.
      Circle circle5 = new Circle(5.5);
      System.out.println(circle5.toString());
      System.out.println(circle5);
      
      
	}
}
