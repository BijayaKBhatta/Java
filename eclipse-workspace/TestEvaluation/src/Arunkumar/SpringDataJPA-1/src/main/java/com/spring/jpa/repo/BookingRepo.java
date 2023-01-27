package com.spring.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.jpa.entity.Booking;
import com.spring.jpa.entity.IdandDest;

@Repository
public interface BookingRepo extends JpaRepository<Booking,Long>{
	
	
	public List<Booking> findByDestination(String dest);

}
