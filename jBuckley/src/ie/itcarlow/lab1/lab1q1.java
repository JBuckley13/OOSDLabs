package ie.itcarlow.lab1;

// Student Name 	: 	Julie Buckley
// Student Id Number: 	C00200976
// Date 			: 	07/10/2021
// Purpose 			: 	Lab 1 Question 1
public class lab1q1 {

		public static void main(String args[]) 
		{ // being main method

			Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
			Thermometer thermB = new Thermometer();
			
			System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
			thermA.setCelsius(20.0);
			System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
			thermB.setCelsius(10.0);
			System.out.println("Temp. of Thermometer B is " + thermB.getCelsius() );
			
		} // end main
	} // end class
