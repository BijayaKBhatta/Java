package com.spring.jpa;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.jpa.entity.Booking;
import com.spring.jpa.repo.BookingRepo;

@SpringBootTest
class SpringDataJpa1ApplicationTests {
	
@Autowired
private BookingRepo  bookingRepo;

	@Test
	void contextLoads() {
	
		List<Booking> bookings = new ArrayList<Booking>();
		bookings.add(Booking.builder().bookingId(6001).destination("Chennai").source("Mysore").phoneNo(9440000000L)
				.vehicleType("L").build());
		bookings.add(Booking.builder().bookingId(6002).destination("Chennai").source("Hyderabad").phoneNo(9850000000L)
				.vehicleType("s").build());	
		
		assertThat(bookings).isEqualTo(bookingRepo.findByDestination("Chennai"));
	}
	

}
