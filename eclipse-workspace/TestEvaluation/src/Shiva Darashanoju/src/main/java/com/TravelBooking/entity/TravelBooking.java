package com.TravelBooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name ="TravellBookings")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TravelBooking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookingId;
	
	@Column(nullable = false)
	private String source;
	
	@Column(nullable = false)
	private String destination;
	
	@Column(nullable = false)
	private String vehicalType;
	
	@Column(nullable = false)
	private Long phoneNo;
	
		
}
