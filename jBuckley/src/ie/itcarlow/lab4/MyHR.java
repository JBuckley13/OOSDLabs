package ie.itcarlow.lab4;

import java.util.Scanner;

public class MyHR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int choice = 0;
		Employee[] employees = new Employee[5];	
		Office[] offices = new Office[3];
		
		for(int y = 0; y <= 2; y++) {
			Office of = new Office();
			offices[y] = of;
		}
		
		while(choice !=4) {
			System.out.println("Please select one of the following options: ");
			System.out.println("1. List all Offices");
			System.out.println("2. Create a new employee record");
			System.out.println("3. List all Employees");
			System.out.println("4. Exit ");
			choice = in.nextInt();
			
			if(choice == 1) {
				//choice 1
				for (Office of:offices) {
					System.out.println(of + "\t" + "No. of Employees: " + of.getNoOfEmployees());
					if(of.getNoOfEmployees() != 0) {
						System.out.println("Employees: " + "\n" + of.printEmployee());
					}
				}
			}
			else if(choice == 2) {
				//choice 2
				if(employees.length <= 5) {
					String fName;
					String lName;
					String street;
					String city;
					String county;
					String empType;
					String comCarType = null;
					Scanner inEmp = new Scanner(System.in);
					
					System.out.println("Please enter employee firstname");
					fName = inEmp.nextLine();
					System.out.println("Please enter employee lastname");
					lName = inEmp.nextLine();
					System.out.println("Please enter street");
					street = inEmp.nextLine();
					System.out.println("Please enter city");
					city = inEmp.nextLine();
					System.out.println("Please enter county");
					county = inEmp.nextLine();
					System.out.println("Please enter employee type (Manager | Staff)");
					empType = inEmp.nextLine();
					if (empType.equalsIgnoreCase("Manager")) {
						System.out.println("Please enter company car type");
						comCarType = inEmp.nextLine();
					}
					Address add = new Address(street, city, county);
					Employee emp = new Employee(fName, lName, add, empType);
					emp.setComCarType(comCarType);
					employees[Employee.noOfEmployees()] = emp;
					for(Office of:offices) {
						if(of.getNoOfEmployees() < 2) {
							of.addEmployee(emp);
							break;
						}
					}
					
				}
				else {
					System.out.println("You have created the maximum number of employees");
				}
			}
			else if(choice == 3) {
				//choice 3
				for(Employee emp:employees) {
					if(emp != null) {
						System.out.println(emp);
					}
				}
			}
			else if(choice == 4) {
				//choice 4
				System.out.println("Goodbye!!");
				System.exit(0);
			}
		}
	}//end main

}
