package ie.itcarlow.lab2;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	16/10/2021
//Purpose 			: 	Lab 2a Question 4

public class lab2aq4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelRoom roomA = new HotelRoom();
		HotelRoom roomB = new HotelRoom();
		HotelRoom roomC = new HotelRoom(202, "Single", 0, 90);
		
		roomA.setRoomNumber(200);		// Setter
		roomA.setRoomType("Single");	// Setter
		roomA.setRoomStatus(1);			// Setter
		roomA.setRoomRate(100);			// Setter
		roomB.setRoomNumber(201);		// Setter
		roomB.setRoomType("Double");	// Setter
		roomB.setRoomStatus(1);			// Setter
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
		System.out.println("Room C is Room Number " + roomC.getRoomNumber());	// Getter
		System.out.println("Room C is a " + roomC.getRoomType() + " room.");	// Getter
		if(roomC.getRoomStatus() == 0)											// if statement to check occupancy with Getter
		{
			System.out.println("Room C is Vacant ");
		}
		else
		{
			System.out.println("Room C is Occupied ");
		}
		System.out.println("Room C's Nightly Rate is €" + roomC.getRoomRate() );	// Getter
		if (roomB.isOccupied() == false)
		{
			roomB.setRoomStatus(1);
			System.out.println("Room B is now set to occupied");
		}
		else
		{
			System.out.println("Room B is already occupied and cannot be double booked ");
		}
			
	}

}
