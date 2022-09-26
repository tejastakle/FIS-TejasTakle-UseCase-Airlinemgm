package com.example.airlinemgm.serv;

import java.util.List;

import com.example.airlinemgm.model.Passenger;

public interface PassengerService {
         public List<Passenger> findallPassengers();
         public Passenger addData(Passenger pass);
}
