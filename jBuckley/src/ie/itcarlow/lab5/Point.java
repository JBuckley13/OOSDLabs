package ie.itcarlow.lab5;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	22/11/2021
//Purpose 			: 	Lab 5 Question 1 part a


public class Point {
	
	//Variables
	private int x;
	private int y;

	//Constructors
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	
	//Getters and Setters
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	
	
	//toString
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
