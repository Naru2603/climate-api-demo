package com.infy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.entity.Climate;
import com.infy.service.ClimateService;

@RestController
public class ClimateController {

	@Autowired
	ClimateService climateService;
	
	@PostMapping("/climates")
	public Climate createClimate(@RequestBody Climate climate) {
		return climateService.createClimate(climate);
		
	}
	
	@GetMapping("/climates/{city}")
	public Climate getClimateByCity(@PathVariable String city)
	{
		return climateService.getClimateByCity(city);
	}
}
