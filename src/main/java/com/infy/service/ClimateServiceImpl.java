package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.infy.entity.Climate;
import com.infy.repository.ClimateRepository;

@Service
public class ClimateServiceImpl implements ClimateService {

	@Autowired
	ClimateRepository climateRepository;
	
	@Override
	public Climate createClimate(Climate climate) {
		return climateRepository.save(climate);
	}

	@Override
	public Climate getClimateByCity(String city) {
		return climateRepository.findByCity(city);
	}

}
