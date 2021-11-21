package ie.itcarlow.lab4;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	21/11/2021
//Purpose 			: 	Lab 4


public class Employee {

	//Variables
	private String firstName;
	private String lastName;
	private Address address;
	private static int nextStaffNumber = 1000; //belongs to employee class and shared among objects
	private int employeeNumber; //
	private String employeeType;
	private String comCarType;
	
	//Constructors
	
	public Employee(String firstName, String lastName, Address address, String employeeType) {
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		setEmployeeType(employeeType);
		setEmployeeNumber(nextStaffNumber);
		nextStaffNumber++;
	}
	
	//Getters and Setters
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getComCarType() {
		return comCarType;
	}
	public void setComCarType(String comCarType) {
		this.comCarType = comCarType;
	}
	
	public static int noOfEmployees() {
		return nextStaffNumber - 1000;
	}
	
	//toString
	@Override
	public String toString() {
		if(employeeType.equalsIgnoreCase("Manager")) {
			return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", employeeNumber=" + employeeNumber + ", employeeType=" + employeeType + ", comCarType=" + comCarType
				+ "]";
		}
		else {
			return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
					+ ", employeeNumber=" + employeeNumber + ", employeeType=" + employeeType + "]";
		}
	}
}