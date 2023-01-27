package com.TravelBooking.service;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TravelBooking.dto.TravelBookingData;
import com.TravelBooking.entity.TravelBooking;
import com.TravelBooking.exception.InvalidDestinationName;
import com.TravelBooking.repository.TravelBookingRepo;


@Service
public class TravelBookingServiceImpl implements TravelBookingService {

	@Autowired
	private TravelBookingRepo travelBookingRepo;
	
	/*The destination name should only contain alphabets (lower case or upper case) and spaces.
	 *  If this is not satisfied throw “InvalidDestinationName” exception.
	The destination name should not contain only spaces.
	 If this is not satisfied throw “InvalidDestinationName” exception.*/

	
	@Override
	public List<TravelBooking> getAllSource(String destination) {
		
		Pattern p1 = Pattern.compile("[\\W]");
		Matcher m1= p1.matcher(destination);
		if(m1.find()) {
		
			throw new InvalidDestinationName("Destination name can not contain any other characters than lower case or upper case");
		}
		
		
		List<TravelBooking> data = travelBookingRepo.getSorceByDestination(destination);
		return data;
	}

}
