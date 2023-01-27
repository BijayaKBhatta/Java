package com.TravelBooking.service;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.TravelBooking.entity.TravelBooking;
import com.TravelBooking.repository.TravelBookingRepo;

@RunWith(MockitoJUnitRunner.class)
public class TravelBookingserviceTest {
	@InjectMocks
	@Autowired
	private	TravelBookingService bookingService;
	@Mock
	private TravelBookingRepo bookingRepo;

	@Test
	public void getSorceByDestinationTest() {
		TravelBooking b = new TravelBooking();
		b.setDestination("Chennai");
		b.setPhoneNo(123457698L);
		b.setSource("Hyd");
		b.setVehicalType("L");
		
		List<TravelBooking> al = new ArrayList<TravelBooking>();
		al.add(b);
		
		Mockito.when(bookingRepo.getSorceByDestination("Chennai")).thenReturn(al);
		List<TravelBooking> bookings = bookingService.getAllSource("Chennai");

		assertEquals(al, bookings)	;
	}
	
}
