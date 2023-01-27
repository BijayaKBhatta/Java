package com.TravelBooking.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import com.TravelBooking.entity.TravelBooking;
import com.TravelBooking.service.TravelBookingService;

@WebMvcTest(TravelBookingController.class)
public class TravelBookingControllerTest {

	@MockBean
	TravelBookingService bookingService;
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testgetTravelBooking() throws Exception {
		TravelBooking b = new TravelBooking();
		b.setDestination("Chennai");
		b.setPhoneNo(123457698L);
		b.setSource("Hyd");
		b.setVehicalType("L");
		
		List<TravelBooking> al = new ArrayList<TravelBooking>();
		al.add(b);
			when(bookingService.getAllSource("Chennai")).thenReturn(al);	
		this.mockMvc.perform(get("/getSourceInfo")).andDo(print()).andExpect(status().isOk())
				.andExpect((ResultMatcher) content().contentType("application/json"));
	}
}