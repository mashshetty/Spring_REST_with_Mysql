package com.rest.controll;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Bike;
import com.rest.service.BikeService;

@RestController
public class BikeController {
	@Autowired
	private BikeService bs;

	public BikeController(BikeService bs) {
		super();
		this.bs = bs;
	}
	
	@PostMapping("/addbike")
	public Bike addBike(@RequestBody Bike bike) {
		
		return bs.addBike(bike);
	}
	
	@GetMapping("/getbikes")
	public List<Bike> getBikes(){
		return bs.getBikes();
	}

	@GetMapping("/getbike/{id}")
	public Optional<Bike> getBike(@PathVariable Long id) {
		return bs.findbike(id);
	}
	
	
	@RequestMapping("/findbyname")
	public List<Bike> findbyname(@RequestParam String bname) {
		return bs.findbyname(bname);
	}
	
	
	@RequestMapping("/sortbikes")
	public List<Bike> sortbikes() {
		return bs.sortBikes();
	}
	
	@GetMapping("/greaterthanid/{id}")
	public List<Bike> lessthanid(@PathVariable("id") Long id){
		return bs.greaterthanid(id);
	}
	
	
	
	

}
