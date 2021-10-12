package ie.itcarlow.lab2;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	12/10/2021
//Purpose 			: 	Lab 2a Question 2

public class lab2aq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HotelRoom roomA = new HotelRoom();
		HotelRoom roomB = new HotelRoom();
		
		roomA.setRoomNumber(200);		// Setter
		roomA.setRoomType("Single");	// Setter
		roomA.setRoomStatus(1);			// Setter
		roomA.setRoomRate(100);			// Setter
		roomB.setRoomNumber(201);		// Setter
		roomB.setRoomType("Double");	// Setter
		roomB.setRoomStatus(0);			// Setter
		roomB.setRoomRate(80);			// Setter
		System.out.println("Room A is Room Number " + roomA.getRoomNumber());	// Getter
		System.out.println("Room A is a " + roomA.getRoomType() + " room.");	// Getter
		if(roomA.getRoomStatus() == 0)											// if statement to check occupancy with Getter
		{
			System.out.println("Room A is Vacant ");
		}
		else
		{
			System.out.println("Room A is Occupied ");
		}
		System.out.println("Room A's Nightly Rate is €" + roomA.getRoomRate() );	// Getter
		System.out.println("Room B is Room Number " + roomB.getRoomNumber());	// Getter
		System.out.println("Room B is a " + roomB.getRoomType() + " room.");	// Getter
		if(roomB.getRoomStatus() == 0)											// if statement to check occupancy with Getter
		{
			System.out.println("Room B is Vacant ");
		}
		else
		{
			System.out.println("Room B is Occupied ");
		}
		System.out.println("Room B's Nightly Rate is €" + roomB.getRoomRate() );	// Getter

	}

}
