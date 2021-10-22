package ie.itcarlow.lab3;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	22/10/2021
//Purpose 			: 	Lab 3 Question 3


// Could Not get toString() calls for account Number and Account Balance to work 


public class BankCustomer {	// class of BankCustomer

	private String customerName;
	private String customerAddress;
	private int noOfAccounts = 0;
	public SavingsAccount sArray[] = new SavingsAccount[3];
	
	public BankCustomer()	// Constructor
	{
		
	}
	
	public BankCustomer(String name, String address) // Overloaded Constructor
	{
		customerName = name;		// Sets Customer name
		customerAddress = address;	// Sets Customer Address
	}
	
	public void setName(String name) // Mutator/Setter Method
	{
		customerName = name;		// Sets Customer name
	}
	
	public void setAddress(String address)	 // Mutator/Setter Method
	{
		customerAddress = address;	// Sets Customer Address
	}
	
	public String getName()	// Selector/Getter Method
	{
		return customerName;	// returns Customer name
	}
	
	public String getAddress()	// Selector/Getter Method
	{
		return customerAddress;	// returns Customer address
	}
	
	public void addAccount(double interestR, double savings)
	{
		if (noOfAccounts < 3)
		{
			sArray[noOfAccounts] = new SavingsAccount(interestR, savings);
			noOfAccounts ++;
		}
	}
	
	public double totalBalance()
	{
		int index;
		double balance = 0;
		
		for(index = 0; index < noOfAccounts; index++)
		{
			balance = balance + sArray[index].getSavingsBalance();
		}
		return balance;
	}
	
	public String toString()
	{
		String myString;
		int index;
		
		myString = "";
		myString += "\n Customer Name : " + getName();
		myString += "\n Customer Address : " + getAddress();
		for(index = 0; index < sArray.length; index++)
		{
			myString += "\n Savings Account " + (index + 1) + " ";
			// myString += "\n Account Number : " + sArray[index].getAccountNumber();
			// myString += "\n Account Balance : " + sArray[index].getSavingsBalance();
		}
		myString += "\n Total Balance : " + totalBalance();
		
		return myString;
	}
}
