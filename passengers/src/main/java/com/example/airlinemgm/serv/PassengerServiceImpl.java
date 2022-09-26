package com.example.airlinemgm.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.airlinemgm.model.Passenger;
import com.example.airlinemgm.repo.PassengerRepo;

@Service
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
	PassengerRepo repo;

	@Override
	public List<Passenger> findallPassengers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Passenger addData(Passenger pass) {
		// TODO Auto-generated method stub
		return repo.save(pass);
	}

}
