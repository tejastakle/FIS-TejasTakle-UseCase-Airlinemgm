package com.example.airlinemgm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airlinemgm.model.Passenger;

public interface PassengerRepo extends JpaRepository<Passenger,Integer> {

}
