package com.example.airlinemgm.service;

import java.util.List;

import com.example.airlinemgm.model.Admin;
import com.example.airlinemgm.model.PassModel;

public interface AdminService {
	
	public List<Admin> displayAdmin();
	
	public Admin addAdmin(Admin admin);
	
	public String deleteAdmin(int flight_id);
	
	
	public List<PassModel> displayAllPass();
	
	
	

}
