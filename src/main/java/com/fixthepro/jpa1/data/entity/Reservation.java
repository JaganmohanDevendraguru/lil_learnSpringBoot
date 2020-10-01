package com.fixthepro.jpa1.data.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RESERVATION")
public class Reservation implements Serializable{

	private static final long serialVersionUID = -3523929107171699156L;

	@Id
	@Column(name="RESERVATION_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long reservationId;
	@Column(name="ROOM_ID")
	private long roomId;
	@Column(name="GUEST_ID")
	private long guestId;
	@Column(name="RES_DATE")
	private Date date;
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(long reservationId, long roomId, long guestId, Date date) {
		super();
		this.reservationId = reservationId;
		this.roomId = roomId;
		this.guestId = guestId;
		this.date = date;
	}
	public long getReservationId() {
		return reservationId;
	}
	public void setReservationId(long reservationId) {
		this.reservationId = reservationId;
	}
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", roomId=" + roomId + ", guestId=" + guestId + ", date="
				+ date + "]";
	}

}
