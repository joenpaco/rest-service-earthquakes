package com.joenpaco.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.joenpaco.models.dtos.FeatureDto;
import com.joenpaco.models.dtos.MagnitudeRequest;
import com.joenpaco.models.dtos.TimeRequest;


public interface EarthQuakeService {

	public abstract ResponseEntity<List<FeatureDto>> findAllEarthQuakeTime(TimeRequest timeRequest);
	
	public abstract ResponseEntity<List<FeatureDto>> findAllEarthQuakeMagnitude(MagnitudeRequest magnitudeRequest);

	public abstract ResponseEntity<List<FeatureDto>> recordEarthQuake(String dateInString);

}
