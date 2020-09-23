package com.joenpaco.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.joenpaco.models.dtos.FeatureDto;
import com.joenpaco.models.dtos.MagnitudeRequest;
import com.joenpaco.models.dtos.TimeRequest;
import com.joenpaco.services.EarthQuakeService;

@RestController
public class EarthQuakeController {
	
	@Autowired
	private EarthQuakeService earthQuakeService;
	
	@PostMapping(value = {"/earthquaketimelist"})
	public ResponseEntity<List<FeatureDto>> findAllEarthQuakeTime(@RequestBody TimeRequest timeRequest) {
				
		return earthQuakeService.findAllEarthQuakeTime(timeRequest);
		
	}
	
	@PostMapping(value = {"/earthquakemagnitudelist"})
	public ResponseEntity<List<FeatureDto>> findAllEarthQuakeMagnitude(@RequestBody MagnitudeRequest magnitudeRequest) {
		
		return earthQuakeService.findAllEarthQuakeMagnitude(magnitudeRequest);
		
	}
	
	@PostMapping(value = "/recordearthquake/{dateString}")
	public ResponseEntity<List<FeatureDto>> recordEarthQuake(@PathVariable String dateString) {
		
		return earthQuakeService.recordEarthQuake(dateString);
		
	}

}
