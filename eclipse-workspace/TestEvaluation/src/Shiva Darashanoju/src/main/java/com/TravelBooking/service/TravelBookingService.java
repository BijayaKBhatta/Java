package com.TravelBooking.service;

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
public class TravelBookingService {

	@Autowired
	private TravelBookingRepo travelBookingRepo;

	public List<TravelBooking> getAllSource(String destination) {

		Pattern p1 = Pattern.compile("[\\W]");
		Matcher match = p1.matcher(destination);
		if (match.find()) {
			throw new InvalidDestinationName("Destination name Should Not Have only Characters");
		}
		List<TravelBooking> data = travelBookingRepo.getSorceByDestination(destination);
		TravelBookingData reqData = new TravelBookingData();
		for (TravelBooking travelBooking : data) {
			reqData.setBookingId(travelBooking.getBookingId());
			reqData.setSource(travelBooking.getSource());
			reqData.setDestination(travelBooking.getDestination());
		}

		return data;
	}

}
