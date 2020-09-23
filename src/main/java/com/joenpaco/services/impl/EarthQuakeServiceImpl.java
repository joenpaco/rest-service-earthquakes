package com.joenpaco.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.joenpaco.daos.FeatureRepository;
import com.joenpaco.models.dtos.EarthquakeDto;
import com.joenpaco.models.dtos.FeatureDto;
import com.joenpaco.models.dtos.MagnitudeRequest;
import com.joenpaco.models.dtos.ResponseDto;
import com.joenpaco.models.dtos.TimeRequest;
import com.joenpaco.models.entities.Feature;
import com.joenpaco.models.entities.Response;
import com.joenpaco.services.EarthQuakeService;
import com.joenpaco.utils.Fecha;

@Service
public class EarthQuakeServiceImpl implements EarthQuakeService {
	
	public static final String QUERY_GENERAL = "https://earthquake.usgs.gov/fdsnws/event/1/";
	
	public static final String QUERY_EARTHQUAKE_NUMBERS = "count?format=geojson";
	
	public static final String QUERY_TIME = "query?format=geojson";
	
	public static final String START_TIME = "&starttime=";
		
	public static final String END_TIME = "&endtime=";
	
	public static final String MIN_MAGNITUDE = "&minmagnitude=";
	
	public static final String MAX_MAGNITUDE = "&maxmagnitude=";

	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private FeatureRepository featureRepository;
	
//	@Autowired
//	private FeatureDto featureDto;
	
	@Autowired
	private Fecha fecha;
	
	@Override
	public ResponseEntity<List<FeatureDto>> findAllEarthQuakeTime(TimeRequest timeRequest) {
		
		return new ResponseEntity<List<FeatureDto>>(restTemplate.getForObject(QUERY_GENERAL + QUERY_TIME + START_TIME + timeRequest.getStartTime() + END_TIME + timeRequest.getEndTime(), ResponseDto.class).getFeatures(), HttpStatus.OK);
		
	}

	@Override
	public ResponseEntity<List<FeatureDto>> findAllEarthQuakeMagnitude(MagnitudeRequest magnitudeRequest) {
		
		return new ResponseEntity<List<FeatureDto>>(restTemplate.getForObject(QUERY_GENERAL + QUERY_TIME + MIN_MAGNITUDE + magnitudeRequest.getMinMagnitude() + MAX_MAGNITUDE + magnitudeRequest.getMaxMagnitude(), ResponseDto.class).getFeatures(), HttpStatus.OK);
		
	}

	@Override
	public ResponseEntity<List<FeatureDto>> recordEarthQuake(String dateInString) {
		
		String fechaActualString = fecha.getDate(dateInString);
		
		String fechaSiguiente = fecha.getDateAfter(fechaActualString);
		
		List<Feature> features = null;
		
		List<FeatureDto> featuresDto = new ArrayList<>();
		
		int earthquakeNumbers = restTemplate.getForObject(QUERY_GENERAL + QUERY_EARTHQUAKE_NUMBERS + START_TIME + fechaActualString + END_TIME + fechaSiguiente, EarthquakeDto.class).getCount();
		
		if (earthquakeNumbers > 0) {
			
			features = restTemplate.getForObject(QUERY_GENERAL + QUERY_TIME + START_TIME + fechaActualString + END_TIME + fechaSiguiente, Response.class).getFeatures();
			
			features.forEach(feature -> {
				
				featureRepository.save(feature);
				
				featuresDto.add(new ObjectMapper().convertValue(feature, FeatureDto.class));
				
				});
			
			return new ResponseEntity<List<FeatureDto>>(featuresDto, HttpStatus.OK);
		}
		
		return new ResponseEntity<List<FeatureDto>>(featuresDto, HttpStatus.NOT_FOUND);		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
