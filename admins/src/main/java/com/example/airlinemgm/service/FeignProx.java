package com.example.airlinemgm.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.airlinemgm.model.PassModel;

@FeignClient(name="passengerservice")
public interface FeignProx {
	@GetMapping("/passenger/display")
	public List<PassModel> displayAllPass();

}
