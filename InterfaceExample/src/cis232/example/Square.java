package cis232.example;

public class Square implements Shape{
	double length;
	
	public Square(double l){
		length = l;
	}
	
	public double getArea(){
		return length * length;
	}
	
	public double getPermiter(){
		return length * 4;
	}
}
