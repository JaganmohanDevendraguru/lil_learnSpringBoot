package com.fixthepro.jpa1.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fixthepro.jpa1.data.entity.Room;
import com.fixthepro.jpa1.data.repository.RoomRepository;

@RestController
@RequestMapping("/api")
public class RoomController{
	
	@Autowired
	private RoomRepository roomRepo;
	
	@GetMapping("rooms")
	public Iterable<Room> getRooms(){
		return roomRepo.findAll();
	}
	
	@GetMapping("user")
	public String getUser(){
		return "User access";
	}
	
	@GetMapping("admin")
	public String getAdmin(){
		return "Admin access";
	}
}