package com.streamdemo;

class Location 
{ 
 private String locationName;
 private String state;
public String getLocationName() {
	return locationName;
}
public void setLocationName(String locationName) {
	this.locationName = locationName;
}
@Override
public String toString() {
	return "Location [locationName=" + locationName + ", state=" + state + "]";
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Location(String locationName, String state) {
	super();
	this.locationName = locationName;
	this.state = state;
}
 
 }  

public class Customer1 
{ 
    
	private String firstName;  
    private String lastName;
    private String emailId;
    private Location location;
	public Customer1(String firstName, String lastName, String emailId, Location location) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.location = location;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
    
 }
 
 