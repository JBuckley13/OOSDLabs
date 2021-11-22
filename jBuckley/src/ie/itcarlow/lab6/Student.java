package ie.itcarlow.lab6;

import java.util.Arrays;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	22/11/2021
//Purpose 			: 	Lab 6 Question 1 part b - Student subclass of Person superclass

public class Student extends Person{

	//Variables 
	public int numCourses = 0;
	public String[] courses = new String[5];
	public int[] grades = new int[5];
	
	//Constructors
	Student(String name, String address) {
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

	// Misc Methods
	public void addCourseGrade(String course, int grade) {
		numCourses++;
		courses[numCourses -1] = course;
		grades[numCourses -1] = grade;
	}
	
	public void printGrades() {
		if(numCourses != 0) {
			for (int i = 0; i < numCourses; i++) {
				System.out.println("Course : " + courses[i] + " Grade : " + grades[i]);
			}
		}
	}
		
	public double getAverageGrade() {
		double averageGrade = 0.0;
		if(numCourses !=0) {
			 for (int j = 0; j < numCourses; j++) {
				 averageGrade += grades[j];
			 }
			 averageGrade = averageGrade / numCourses;
		}
		return averageGrade;
	
	}
	
	//toString
	@Override
	public String toString() {
		return "Student : "
				+ super.toString() + " ";
	}

	
}
