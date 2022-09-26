package com.example.airlinemgm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.airlinemgm.model.Admin;
import com.example.airlinemgm.model.PassModel;
import com.example.airlinemgm.service.AdminService;


@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService service;
	
	@GetMapping("/display")
	public List<Admin> display(){
		return service.displayAdmin();
	}
	
	@PostMapping("/add")
	public Admin add(@RequestBody Admin admin) {
		return service.addAdmin(admin);
		
	}
	
	@DeleteMapping("/delete/{flight_id}")
	public String delete(@PathVariable("flight_id")int flight_id) {
		return service.deleteAdmin(flight_id);
	}
	
	@GetMapping("/passenger/display")
	public List<PassModel> getPassData()
	{
		return service.displayAllPass();
	}
	
	
	

}
