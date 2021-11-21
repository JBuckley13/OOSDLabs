package ie.itcarlow.lab32;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	20/11/2021
//Purpose 			: 	Lab 3 Question 2 Revised learning 
public class SavingsAccount {

	//Variables
	private int accountNo; // one per object instance
	private static int nextAccountNo = 0; // shared by all object instances
	private static double annualInterestRate = 0.0;
	private double savingsBalance;

	//Constructors
	public SavingsAccount() {
		++nextAccountNo;
		setAccountNo(nextAccountNo);
	}

	public SavingsAccount(double savingsBalance) {
		++nextAccountNo;
		setAccountNo(nextAccountNo);
		setSavingsBalance(savingsBalance);
	}
	
	//Getters & Setters
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void modifyInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	//Misc Methods
	
	public void calculateMonthlyInterest() {
		savingsBalance += ((getSavingsBalance() * getAnnualInterestRate()) /12);
	}

	//to String
	
	@Override
	public String toString() {
		return "SavingsAccount [accountNo=" + accountNo + ", savingsBalance=" + savingsBalance + "]";
	}
	
	
}
