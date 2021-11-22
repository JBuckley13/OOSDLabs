package ie.itcarlow.lab5;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	22/11/2021
//Purpose 			: 	Lab 5 Question 1 part b

public class Circle extends Point{
	//Variables
	private int radius;

	//Constructors
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	//Getters and Setters
	public synchronized int getRadius() {
		return radius;
	}

	public synchronized void setRadius(int radius) {
		this.radius = radius;
	}

	//toString
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", toString()=" + super.toString() + "]";
	}
	
	
}
