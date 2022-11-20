package com.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Bike;
import com.rest.repo.BikeRepo;



@Service
public class BikeService {
	@Autowired
	private BikeRepo repo;

	
	
	public BikeService(BikeRepo repo) {
		super();
		this.repo = repo;
	}



	public Bike addBike(Bike bike) {
		repo.save(bike);
		return bike;
	}
	
	public List<Bike> getBikes(){
		return repo.findAll();
	}
	
	public Optional<Bike> findbike(Long id) {
		return repo.findById(id);
	}
	
	public List<Bike> findbyname(String bname) {
		return repo.findByBname(bname);
	}
	
	public List<Bike> sortBikes(){
		return repo.findByBnameSort();
	}
	
	public List<Bike> greaterthanid(Long id){
		return repo.findByBidGreaterThan(id);
	}

}
