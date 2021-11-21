package ie.itcarlow.lab4;

//Student Name 		: 	Julie Buckley
//Student Id Number	: 	C00200976
//Date 				: 	21/11/2021
//Purpose 			: 	Lab 4

public class Address extends Object{

	//Variables
	private String street;
	private String city;
	private String county;
	
	//Constructors
	
	public Address(String street, String city, String county) {
		setStreet(street);
		setCity(city);
		setCounty(county);
	}
	
	//Getters and Setters
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", county=" + county + "]";
	}

}
