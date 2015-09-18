package cis232.example;

import java.util.ArrayList;

public class InterfaceExample {
	
	public static void main(String[] args){
		
		ArrayList<Shape> shapes = new ArrayList<>();
		
//		Circle c = new Circle(5);
//		System.out.println("Circle's area is: " + c.getArea());
//		shapes.add(c);
//		
//		Square s = new Square(5);
//		System.out.println("Square's area is: " + s.getArea());
//		shapes.add(s);
		
		shapes.add(new Circle(5));
		shapes.add(new Square(5));
		
		for(Shape s : shapes){
			System.out.println("Shape area is: " + s.getArea());
			//DOESN'T WORK BECAUSE IT'S NOT IN SHAPE INTERFACE!!!!
			//System.out.println("Shape perimeter is: " + s.getPerimeter());
		}
	}
	
}
