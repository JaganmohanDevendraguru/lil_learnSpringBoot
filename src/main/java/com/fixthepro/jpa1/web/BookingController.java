package com.fixthepro.jpa1.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fixthepro.jpa1.business.service.BookingDetailsService;

@Controller
public class BookingController {

	private BookingDetailsService service;

	@Autowired
	public BookingController(BookingDetailsService service) {
		this.service = service;
	};

	@GetMapping("/reservations")
	public ModelAndView getBookingReservations(@RequestParam(value="date", required=false) String paramDate, ModelAndView model){
		Date date = DateUtils.createDateFromString(paramDate);
		System.out.println(date +" <=> "+ paramDate);
		model.setViewName("bookings");
		model.addObject("bookings", service.getBookingDetailsForDate(date));
		return model;
	}
	
	@GetMapping("/availability")
	public ModelAndView getAvailabilities(@RequestParam(value="date", required=false) String paramDate, ModelAndView model){
		Date date = DateUtils.createDateFromString(paramDate);
		System.out.println(date +" <=> "+ paramDate);
		model.setViewName("availability");
		model.addObject("bookings", service.getAvailabilitiesForDate(date));
		return model;
	}
}