package com.example.airlinemgm.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.example.airlinemgm.model.Admin;
import com.example.airlinemgm.model.PassModel;
import com.example.airlinemgm.repo.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	FeignProx proxy;
	
	
	
	@Autowired
	AdminRepository repo;

	@Override
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return repo.save(admin);
	}

	@Override
	public String deleteAdmin(int flight_id) {
		// TODO Auto-generated method stub
		repo.deleteById(flight_id);
		return "Record deleted....!";
	}

	@Override
	public List<Admin> displayAdmin() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<PassModel> displayAllPass() {
		// TODO Auto-generated method stub
	        return proxy.displayAllPass();
	}
	
	

}
