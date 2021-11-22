package ie.itcarlow.lab6;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	22/11/2021
//Purpose 			: 	Lab 6 Question 1 Part a - Person.java source file from blackboard

public class Person {
	
	//Variables
	private String name;
	private String address;
	
	//Constructors
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
	//toString
	public String toString() {
		return name + " ( " + address + " ) ";
		
	}
}
