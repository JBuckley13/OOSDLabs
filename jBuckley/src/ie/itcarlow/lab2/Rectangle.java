package ie.itcarlow.lab2;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	16/10/2021
//Purpose 			: 	Implements a Rectangle class.
//		
public class Rectangle {
	private double rectangleLength;
	private double rectangleWidth;
	
	public Rectangle() // Constructor #1
	{
		setLength(1);
		setWidth(1);
	}
	
	public Rectangle(double length, double width)	// Constructor #2
	{											// Overloaded
		setLength(length);					// sets length
		setWidth(width);					// sets width
	}
	
	public void setLength(double length)	// Setter Length
	{
		if((length >= 0.0) && (length <= 40.0))
		{
			rectangleLength = length;
		}
		else
		{
			System.out.println("length is out of bounds ");
		}
	}
	
	public void setWidth(double width)		// Setter Width
	{
		if((width >= 0.0) && (width <= 40.0))
		{
			rectangleWidth = width;
		}
		else
		{
			System.out.println("width is out of bounds ");
		}
	}
	
	public double getLength()	// Getter for Length
	{
		return rectangleLength;
	}
	
	public double getWidth()	// Getter for Width
	{
		return rectangleWidth;
	}
	
	public double getArea() // Method for getting rectangles area
	{
		double area;
		
		area = rectangleLength * rectangleWidth;
		return area;
	}
	
	public double getPerimeter() // Method for getting rectangles perimeter
	{
		double perimeter;
		
		perimeter = (rectangleLength * 2) + (rectangleWidth * 2);
		return perimeter;
	}
	
	public void printRectangle() // Method to print the rectangle
	{
		int index;
		int index2;
		for (index = 0; index <= (int)rectangleWidth - 1; index ++)
		{
			System.out.print("* ");
		}
		
		for (index2 = 0; index2 <= (int)rectangleLength - 3; index2++)
		{
			System.out.println("");
			System.out.print("*");
			for (index = 0; index <= (int)rectangleWidth - 2; index ++)
			{
				System.out.print("  ");
			}
			System.out.print("*");
		}
		System.out.println("");
		for (index = 0; index <= (int)rectangleWidth - 1; index ++)
		{
			System.out.print("* ");
		}
			
	}
	
	public String toString() // toString() Method
	{
		String myString;
		
		myString = "";
		myString += "\n Length = " + getLength();
		myString += "\n Width = " + getWidth();
		myString += "\n Area = " + getArea();
		myString += "\n Perimeter = " + getPerimeter();
		return myString;
	}
}
