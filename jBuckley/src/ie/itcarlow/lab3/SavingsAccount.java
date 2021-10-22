package ie.itcarlow.lab3;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	21/10/2021
//Purpose 			: 	Lab 3 Question 2

public class SavingsAccount{
	
	private static int numberOfAccounts = 0; //
	public static double annualInterestRate;
	private double savingsBalance;
	private int accountNumber;

	public SavingsAccount() // Constructor
	{
		numberOfAccounts++;
		accountNumber = numberOfAccounts;
		annualInterestRate = 0.0;
		savingsBalance = 0.0;
	}
	
	public SavingsAccount(double interestR, double savings)
	{
		numberOfAccounts++;
		accountNumber = numberOfAccounts;
		annualInterestRate = interestR;
		savingsBalance = savings;
	}
	
	public static void modifyInterestRate(double interestR)
	{
		annualInterestRate = interestR;
	}
	
	public void setSavingsBalance(double savings)
	{
		savingsBalance = savings;
	}
	
	public double calculateMonthlyInterest()
	{
		double monthlyInterest;
		
		monthlyInterest = (savingsBalance * (annualInterestRate/12));
		savingsBalance = savingsBalance + monthlyInterest;
		return monthlyInterest;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getSavingsBalance()
	{
		return savingsBalance;
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
}
