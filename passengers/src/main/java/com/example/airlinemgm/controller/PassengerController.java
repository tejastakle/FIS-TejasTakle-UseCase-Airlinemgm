package com.example.airlinemgm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.airlinemgm.model.Passenger;
import com.example.airlinemgm.serv.PassengerService;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
	
	@Autowired
	PassengerService service;
	
	@GetMapping("/display")
	public List<Passenger> displayPassenger()
	{
		return service.findallPassengers();
	}
	
	@PostMapping("/addpass")
	public Passenger addPass(@RequestBody Passenger pass)
	{
		return service.addData(pass);
	}

}
