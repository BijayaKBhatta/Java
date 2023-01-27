package com.TravelBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.TravelBooking.entity.TravelBooking;
import com.TravelBooking.service.TravelBookingService;

@Controller
public class TravelBookingController {
	
	@Autowired
	private TravelBookingService travelBookingService;
	
	//Hit this endpoint to see html page
	@RequestMapping("/travelbooking")
	public String getTravelBooking() {
		return "travelbooking";
	}
	@RequestMapping("/getSourceInfo")
	public String getSourceInfo(@RequestParam("destination") String destination, Model model) {
		List<TravelBooking> allSourceInfo = travelBookingService.getAllSource(destination);
		model.addAttribute("allData", allSourceInfo);
		return "sourcelist";
	}
}
