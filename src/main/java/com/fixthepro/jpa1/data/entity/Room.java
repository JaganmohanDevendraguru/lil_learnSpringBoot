package com.fixthepro.jpa1.data.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROOM")
public class Room implements Serializable {

	private static final long serialVersionUID = 270684072030913236L;
	
	@Id
	@Column(name="ROOM_ID")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long roomId;
	@Column(name="NAME")
	private String name;
	@Column(name="ROOM_NUMBER")
	private String roomNumber;
	@Column(name="BED_INFO")
	private String bedInfo;
	
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getBedInfo() {
		return bedInfo;
	}
	public void setBedInfo(String bedInfo) {
		this.bedInfo = bedInfo;
	}
	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", name=" + name + ", roomNumber=" + roomNumber + ", bedInfo=" + bedInfo
				+ "]";
	}
	public Room(long roomId, String name, String roomNumber, String bedInfo) {
		super();
		this.roomId = roomId;
		this.name = name;
		this.roomNumber = roomNumber;
		this.bedInfo = bedInfo;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
