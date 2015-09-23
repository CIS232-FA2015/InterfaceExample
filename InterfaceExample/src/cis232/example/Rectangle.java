package cis232.example;

public class Rectangle implements Shape{
	double length, width;
	
	public Rectangle(double l, double w){
		length = l;
		width = w;
	}
	
	public double getArea(){
		return length * width;
	}
}
