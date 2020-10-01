package com.fixthepro.jpa1.business.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fixthepro.jpa1.business.domain.BookingDetails;
import com.fixthepro.jpa1.data.entity.Guest;
import com.fixthepro.jpa1.data.entity.Reservation;
import com.fixthepro.jpa1.data.entity.Room;
import com.fixthepro.jpa1.data.repository.GuestRepository;
import com.fixthepro.jpa1.data.repository.ReservationRepository;
import com.fixthepro.jpa1.data.repository.RoomRepository;

@Service
public class BookingDetailsService {

	private final RoomRepository roomRepo;
	private final GuestRepository guestRepo;
	private final ReservationRepository reservRepo;

	@Autowired
	public BookingDetailsService(RoomRepository roomRepo, GuestRepository guestRepo, ReservationRepository reservRepo) {
		super();
		this.roomRepo = roomRepo;
		this.guestRepo = guestRepo;
		this.reservRepo = reservRepo;
	}
	
	public List<BookingDetails> getBookingDetailsForDate(Date date){
		Map<Long, BookingDetails> bookingMap = new HashMap<>();
		Iterable<Room> roomsList = this.roomRepo.findAll();
		roomsList.forEach(room -> {
			BookingDetails bookObj = new BookingDetails();
			bookObj.setRoomId(room.getRoomId());
			bookObj.setRoomName(room.getName());
			bookObj.setRoomNumber(room.getRoomNumber());
			bookingMap.put(room.getRoomId(), bookObj);
		});
		
		Iterable<Reservation> reservList = reservRepo.findReservationByDate(new java.sql.Date(new Date().getTime()));
		reservList.forEach(reserv -> {
			BookingDetails bookDet = bookingMap.get(reserv.getRoomId());
			bookDet.setDate(reserv.getDate());
			Guest guest = this.guestRepo.findByGuestId(reserv.getGuestId());
			bookDet.setFirstName(guest.getFirstName());
			bookDet.setLastName(guest.getLastName());
			bookDet.setGuestId(guest.getGuestId());
		});
		List<BookingDetails> bookDetList = new ArrayList<>();
		for(long id: bookingMap.keySet()) {
			bookDetList.add(bookingMap.get(id));
		}
		return bookDetList;
	}
}
