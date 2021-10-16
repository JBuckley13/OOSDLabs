package ie.itcarlow.lab2;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	12/10/2021
//Purpose 			: 	Implements a HotelRoom class.
//						
public class HotelRoom {
	private int roomNumber; 	// Private Integer for Room Number
	private String roomType; 	// Private String for Room Type
	private int roomStatus; 	// Private Integer for Room Status (0 for Vacant, 1 for Occupied)
	private double roomRate;	// Private Double for Nightly Room Rate
	
	public HotelRoom() // Constructor #1
	{
		setRoomNumber(0);
		setRoomType("");
	}
	
	public HotelRoom(int roomN, String roomT, int roomS, double roomR)	// Constructor #2
	{											// Overloaded
		setRoomNumber(roomN);					// sets room Number
		setRoomType(roomT);						// sets room Type
		setRoomStatus(roomS);					// sets room Status
		setRoomRate(roomR);						// sets room Rate
	}
	
	public void setRoomNumber(int roomN)	// Setter for Room Number
	{
		roomNumber = roomN;
	}

	public void setRoomType(String roomT)	// Setter for Room Type
	{
		roomType = roomT;
	}
	
	public void setRoomStatus(int roomS)		// Setter for Room Status
	{
		roomStatus = roomS;
	}
	
	public void setRoomRate(double roomR)	// Setter for Room Rate
	{
		roomRate = roomR;
	}
	
	public int getRoomNumber()	// Getter for Room Number
	{
		return roomNumber;
	}
	
	public String getRoomType()	// Getter for Room Type
	{
		return roomType;
	}
	
	public int getRoomStatus()	// Getter for Room Status (0/1 - Vacant/Occupied)
	{
		return roomStatus;
	}
	
	public double getRoomRate()	// Getter for Nightly Room Rate
	{
		return roomRate;
	}
	
	public boolean isOccupied() 
	{
		if (roomStatus == 1)	
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
}	// End HotelRoom class
