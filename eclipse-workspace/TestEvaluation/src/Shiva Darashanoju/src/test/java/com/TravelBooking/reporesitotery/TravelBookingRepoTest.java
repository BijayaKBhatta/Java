package com.TravelBooking.reporesitotery;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.TravelBooking.entity.TravelBooking;
import com.TravelBooking.repository.TravelBookingRepo;
@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TravelBookingRepoTest {
	
	@Autowired
	private TravelBookingRepo bookingRepository;

	@Test
	public void testGetTravelBooking() throws Exception {
		List<TravelBooking> bookings = new ArrayList<TravelBooking>();
		bookings.add(TravelBooking.builder().bookingId(6001).source("Mysore").destination("Chennai").vehicalType("L").phoneNo(9440000000L).build());
		bookings.add(TravelBooking.builder().bookingId(6002).source("Hyderabad").destination("Chennai").vehicalType("S").phoneNo(9850000000L).build());
		
		assertThat(bookings).isEqualTo(bookingRepository.getSorceByDestination("Chennai"));
	}
}
