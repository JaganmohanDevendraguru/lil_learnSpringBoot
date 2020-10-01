package com.fixthepro.jpa1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fixthepro.jpa1.data.entity.Guest;
import com.fixthepro.jpa1.data.entity.Reservation;
import com.fixthepro.jpa1.data.entity.Room;
import com.fixthepro.jpa1.data.repository.GuestRepository;
import com.fixthepro.jpa1.data.repository.ReservationRepository;
import com.fixthepro.jpa1.data.repository.RoomRepository;

@SpringBootApplication
public class SchemaExeutionFromFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchemaExeutionFromFileApplication.class, args);
		
	}
	
	@RestController
	@RequestMapping("/rooms")
	public class RoomController{
		
		@Autowired
		private RoomRepository roomRepo;
		
		@GetMapping
		public Iterable<Room> getRooms(){
			return roomRepo.findAll();
		}
	}
	
	@RestController
	@RequestMapping("/guests")
	public class GuestController{
		
		@Autowired
		private GuestRepository guestRepo;
		
		@GetMapping
		public Iterable<Guest> getGuests(){
			return guestRepo.findAll();
		}
	}

}
