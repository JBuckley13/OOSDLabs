package ie.itcarlow.lab2;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	12/10/2021
//Purpose 			: 	Implements a HotelRoom class.
//						
public class HotelRoom {
	private int roomNumber; // Private Integer for Room Number
	private String roomType; // Private String for Room Type
	
	public HotelRoom() // Constructor #1
	{
		setRoomNumber(0);
		setRoomType("");
	}
	
	public HotelRoom(int roomN, String roomT)	// Constructor #2
	{											// Overloaded
		setRoomNumber(roomN);
		setRoomType(roomT);
	}
	
	public void setRoomNumber(int roomN)	// Setter for Room Number
	{
		roomNumber = roomN;
	}

	public void setRoomType(String roomT)	// Setter for Room Type
	{
		roomType = roomT;
	}
	
	public int getRoomNumber()	// Getter for Room Number
	{
		return roomNumber;
	}
	
	public String getRoomType()	// Getter for Room Type
	{
		return roomType;
	}
}	// End HotelRoom class
