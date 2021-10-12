package ie.itcarlow.lab2;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	07/10/2021
//Purpose 			: 	Lab 2a Question 1

public class lab2aq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HotelRoom roomA = new HotelRoom();
		HotelRoom roomB = new HotelRoom();
		
		roomA.setRoomNumber(200);		// Setter
		roomA.setRoomType("Single");	// Setter
		roomB.setRoomNumber(201);		// Setter
		roomB.setRoomType("Double");	// Setter
		System.out.println("Room A is Room Number " + roomA.getRoomNumber());	// Getter
		System.out.println("Room A is a " + roomA.getRoomType() + " room.");	// Getter
		System.out.println("Room B is Room Number " + roomB.getRoomNumber());	// Getter
		System.out.println("Room B is a " + roomB.getRoomType() + " room.");	// Getter
		
	}	// End of main

}	// End of class
