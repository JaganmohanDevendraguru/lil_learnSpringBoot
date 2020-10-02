package com.fixthepro.jpa1.business.domain;

import java.util.Date;

public class BookingDetails {
	
	private long roomId;
	private long guestId;
	private String firstName;
	private String lastName;
	private Date date;
	private String roomName;
	private String roomNumber;
	
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public long getGuestId() {
		return guestId;
	}
	public void setGuestId(long guestId) {
		this.guestId = guestId;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	@Override
	public String toString() {
		return "BookingDetails [roomId=" + roomId + ", guestId=" + guestId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", date=" + date + ", roomName=" + roomName + ", roomNumber=" + roomNumber + "]";
	}	
	
}
