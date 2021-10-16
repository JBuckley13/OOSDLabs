package ie.itcarlow.lab2;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	16/10/2021
//Purpose 			: 	Lab 2b Question 2 driver program
//	
public class lab2bq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double lengthA = 5.0;
		double widthA = 10.0;
		double lengthB = 15.0;
		double widthB = 20.0;
		
		Rectangle rectA = new Rectangle();
		Rectangle rectB = new Rectangle(lengthB, widthB);

		rectA.setLength(lengthA);
		rectA.setWidth(widthA);
		System.out.println("Rectangle A's length is " + rectA.getLength());
		System.out.println("Rectangle A's width is " + rectA.getWidth());
		System.out.println("Rectangle A's area is " + rectA.getArea());
		System.out.println("Rectangle A's perimeter is " + rectA.getPerimeter());
		System.out.println("");
		System.out.println("Rectangle B : ");
		System.out.println(rectB.toString());
	}

}
