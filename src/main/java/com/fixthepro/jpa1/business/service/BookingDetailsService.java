package com.fixthepro.jpa1.business.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.StreamSupport;

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
		//return list initialize
		List<BookingDetails> bookDetList = new ArrayList<>();
		//list of reservation of that date
		Iterable<Reservation> reservList = reservRepo.findReservationByDate(new java.sql.Date(date.getTime()));
		//if we have reservations on that day loop it
		if (reservList != null && (StreamSupport.stream(reservList.spliterator(), false).count() < 1) ) {
			
		}
		reservList.forEach(reserv -> {
			BookingDetails bookObj = new BookingDetails();
			bookObj.setDate(reserv.getDate());
			Guest guest = this.guestRepo.findByGuestId(reserv.getGuestId());
			bookObj.setFirstName(guest.getFirstName());
			bookObj.setLastName(guest.getLastName());
			bookObj.setGuestId(guest.getGuestId());
			Room room = this.roomRepo.findRoomByRoomId(reserv.getRoomId());
			bookObj.setRoomId(room.getRoomId());
			bookObj.setRoomName(room.getName());
			bookObj.setRoomNumber(room.getRoomNumber());
			bookDetList.add(bookObj);
		});
		
		return bookDetList;
	}
}
