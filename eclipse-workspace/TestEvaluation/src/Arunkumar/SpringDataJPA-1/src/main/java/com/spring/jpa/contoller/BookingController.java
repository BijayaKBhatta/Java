package com.spring.jpa.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.jpa.entity.Booking;
import com.spring.jpa.entity.Destination;
import com.spring.jpa.exception.InvalidDestinationName;
import com.spring.jpa.repo.BookingRepo;

@Controller
public class BookingController {
	
	@Autowired
	private BookingRepo repo;
	
	
	@RequestMapping("/")    
	public String index()  
	{    
	return"booking";    
	}    
	

	@RequestMapping(value="/save", method=RequestMethod.POST)    
	public ModelAndView save(@ModelAttribute Destination dest) throws InvalidDestinationName  
	{ 
		
		//String regex="^[^\\d\\s]+$";
		
		if(!dest.getDest().isEmpty() && dest.getDest().matches("^[^\\d\\s]+$")) {
	List<Booking> booking=	 repo.findByDestination(dest.getDest());
	System.out.println(booking);
	ModelAndView modelAndView = new ModelAndView();    
	modelAndView.setViewName("data");        
	modelAndView.addObject("booking", booking);
	return modelAndView;    
		}
		else {
			throw new InvalidDestinationName("the destination which you have entered is invalid");
		}
	}    
}
