package stream_misc;

abstract class Shape{
	public abstract double area();
}

class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public double area() {
		return length * breadth;
	}
}

public class PolyShape{
	public static void main(String[] args) {
		Shape circ = new Circle(7.0);
		Shape rect = new Rectangle(8.0, 6.0);
		
		System.out.println("Area of Circle is: " + circ.area());
		System.out.println("Area of Rectangle is: " + rect.area());
	}
}


