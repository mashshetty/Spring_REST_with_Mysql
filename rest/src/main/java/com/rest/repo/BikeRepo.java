package com.rest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rest.model.Bike;

public interface BikeRepo extends JpaRepository<Bike, Long> {

	List<Bike> findByBname(String bname);
	
	
	@Query("from Bike order by bname")
	List<Bike> findByBnameSort();
	
	List<Bike> findByBidGreaterThan(Long id);

}
