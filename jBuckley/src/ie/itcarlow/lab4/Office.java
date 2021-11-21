package ie.itcarlow.lab4;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	21/11/2021
//Purpose 			: 	Lab 4

public class Office extends Object{
	
	//Variables
	private static int nextOffice = 100;
	private int officeNumber;
	private int noOfEmployees = 0;
	private Employee[] employees = new Employee[2];
	
	//Constructors
	
	public Office() {
		setOfficeNumber(nextOffice);
		nextOffice++;
	}
	
	//Getters and Setters
	
	public int getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(int officeNumber) {
		this.officeNumber = officeNumber;
	}
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	public Employee[] getEmployees() {
		return employees;
	}
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
	//Misc Methods

	public void addEmployee(Employee employee) {
		if(noOfEmployees <= 2) {
			employees[noOfEmployees] = employee;
			noOfEmployees++;
		}
		else {
			System.out.println("You have reached the max number of employees in this office");
		}
	}
	
	public String printEmployee() {
		String employeeDetails = "";
		for(Employee emp:employees) {
			if(emp != null) {
				employeeDetails += emp.getEmployeeNumber() + ", " + emp.getFirstName() + ", " + emp.getLastName() + "\n";
			}
		}
		return employeeDetails;
	}
	
	//toString
	@Override
	public String toString() {
		return "Office [officeNumber=" + officeNumber + "]";
	}


}
