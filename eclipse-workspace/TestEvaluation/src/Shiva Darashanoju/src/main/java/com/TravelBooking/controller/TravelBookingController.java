package com.TravelBooking.controller;

import java.util.List;
import java.util.regex.Pattern;

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

	//Use this Controller Mapping to Get Search html Page;
	@RequestMapping("/travelbooking")
	public String getTravelBooking() {
		return "Travelbooking";
	}

	@RequestMapping("/getSourceInfo")
	public String getSourceInfo(@RequestParam("destination") String destination, Model model) {
		Pattern regex = Pattern.compile("[$&+,:;=\\\\?@#|/'<>.^*()%!-1234567890]");
		List<TravelBooking> allSourceInfo = travelBookingService.getAllSource(destination);
		if (regex.matcher(destination).find() || allSourceInfo.isEmpty() || allSourceInfo == null) {
			String s = "No Data Found or Plese Check the Destination : "+ destination;
			model.addAttribute("message",s);
			return "NotFound";
		} else {
			model.addAttribute("Data", allSourceInfo);
			System.out.println(allSourceInfo);

		}
		return "Travelbooking";
	}

}
