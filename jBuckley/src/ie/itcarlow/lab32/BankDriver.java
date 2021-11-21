package ie.itcarlow.lab32;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	20/11/2021
//Purpose 			: 	Lab 3 Question 2 Revised learning 

public class BankDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount saver1 = new SavingsAccount();
		
		saver1.setSavingsBalance(2000.00);
		
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		

		SavingsAccount.modifyInterestRate(0.05);

		saver1.calculateMonthlyInterest();
		
		saver2.calculateMonthlyInterest();
		
		BankCustomer bc = new BankCustomer("John", "Cork");
		bc.addAccount(saver1);
		bc.addAccount(saver2);
		
		System.out.println(bc);
		System.out.println("Saving Total: " + bc.balance(bc.getSavaccs()));
	}

}
