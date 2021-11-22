package ie.itcarlow.lab6;

import java.util.Arrays;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	22/11/2021
//Purpose 			: 	Lab 6 Question 1 part b - Teacher subclass of Person superclass

public class Teacher extends Person{

	//Variables 
	public int numCourses = 0;
	public String[] courses = new String[5];
	
	//Constructors
	Teacher(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	//Getters and Setters
	public synchronized int getNumCourses() {
		return numCourses;
	}

	public synchronized void setNumCourses(int numCourses) {
		this.numCourses = numCourses;
	}
	
	//Misc Methods
	public boolean addCourse(String course) {
		courses[numCourses] = course;
		if(courses[numCourses] == course)	{
			numCourses++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean removeCourse(String course) {
		int remove = -1;
		
		for (int i = 0; i < numCourses; i++)
			if (course.equalsIgnoreCase(courses[i])) {
				remove = i;
				break;
			}
		if (remove != -1) {
			courses[remove] = null;
			return true;
		}
		else {
			return false;
		}
	}
 
	//toString 
	@Override
	public String toString() {
		return "Teacher : " + super.toString() + " ";
	}

	
	
	
	
}
