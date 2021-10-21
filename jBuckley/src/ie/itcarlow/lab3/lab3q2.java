package ie.itcarlow.lab3;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	21/10/2021
//Purpose 			: 	Lab 3 Question 2

public class lab3q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount saver1 = new SavingsAccount(0.04, 2000.0);
		SavingsAccount saver2 = new SavingsAccount(0.04, 3000.0);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("New Balance for Saver 1 = €" + saver1.getSavingsBalance());
		System.out.println("New Balance for Saver 2 = €" + saver2.getSavingsBalance());
		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("New Balance for Saver 1 = €" + saver1.getSavingsBalance());
		System.out.println("New Balance for Saver 2 = €" + saver2.getSavingsBalance());
	}

}
