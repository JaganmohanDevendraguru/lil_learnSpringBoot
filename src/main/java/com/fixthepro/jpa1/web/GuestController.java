package com.fixthepro.jpa1.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fixthepro.jpa1.data.repository.GuestRepository;

@Controller
@RequestMapping("/guests")
public class GuestController {

	@Autowired
	private GuestRepository guestRepo;
	
	@GetMapping
	public String getGuests(Model model){
		model.addAttribute("guests", guestRepo.findAll());
		return "guest";
	}
}
