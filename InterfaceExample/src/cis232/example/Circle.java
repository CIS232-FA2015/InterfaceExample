package cis232.example;

public class Circle implements Shape{

	private double radius;
	
	public Circle(double r){
		radius = r;
	}
	
	public double getArea() {
		
		return Math.PI * radius * radius;
	}

}
