package com.TravelBooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.TravelBooking.entity.TravelBooking;
@Repository
public interface TravelBookingRepo extends JpaRepository<TravelBooking, Integer>{

	@Query(value = "select TravelBooking from TravelBooking as TravelBooking where destination=:destination")
	List<TravelBooking> getSorceByDestination(@Param("destination") String destination);
}
