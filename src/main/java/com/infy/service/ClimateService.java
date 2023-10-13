package com.infy.service;

import com.infy.entity.Climate;

public interface ClimateService {

	public Climate createClimate(Climate climate);

	public Climate getClimateByCity(String city);

}
