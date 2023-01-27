package com.TravelBooking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TravelBookingData {

	private Integer bookingId;

	private String source;

	private String destination;

}
