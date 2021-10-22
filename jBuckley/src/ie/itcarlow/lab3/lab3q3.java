package ie.itcarlow.lab3;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	22/10/2021
//Purpose 			: 	Lab 3 Question 3

public class lab3q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankCustomer saver1 = new BankCustomer("J Buckley", "Paulstown, Kilkenny");
		BankCustomer saver2 = new BankCustomer("L Morris", "Gorey, Wexford");		
		
		saver1.addAccount(0.05, 2000);
		saver1.addAccount(0.1, 5000);
		saver2.addAccount(0.05, 3000);
		System.out.println(saver1.toString());
		System.out.println(saver2.toString());
	}

}