package com.TravelBooking.service;

import java.util.List;

import com.TravelBooking.entity.TravelBooking;

public interface TravelBookingService {

	List<TravelBooking> getAllSource(String destination);

}
