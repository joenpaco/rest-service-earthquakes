package com.joenpaco.services.impl;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.joenpaco.Factory;
import com.joenpaco.TimeRequestParameterResolver;
import com.joenpaco.daos.FeatureRepository;
import com.joenpaco.models.dtos.FeatureDto;
import com.joenpaco.models.dtos.ResponseDto;
import com.joenpaco.models.dtos.TimeRequest;


class EarthQuakeServiceImplTest {
	
	@InjectMocks
	EarthQuakeServiceImpl earthQuakeServiceImpl;
	
	@Mock
	private FeatureRepository featureRepository;
	
	@Mock
	private RestTemplate restTemplate;
	
//	@Mock
	private ResponseDto responseDto;
	
//	@Mock
//	private TimeRequest timeRequest;
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	@ExtendWith(TimeRequestParameterResolver.class)
	void findAllEarthQuakeTime(TimeRequest timeRequest) {
		
		timeRequest.setStartTime("2014-01-01");
		
		timeRequest.setEndTime("2014-01-02");
		
		final String QUERY_GENERAL = "https://earthquake.usgs.gov/fdsnws/event/1/";
		
		final String QUERY_TIME = "query?format=geojson";
		
		final String START_TIME = "&starttime=";
			
		final String END_TIME = "&endtime=";

		
		// 1.- Arrange
		FeatureDto featureDto;
		
		responseDto = new ResponseDto();
		
		List<FeatureDto> featureDtoFalsos = new ArrayList<FeatureDto>();
		
		List<FeatureDto> featureDtos = Factory.getFeatureDto();
		
		for (FeatureDto element : featureDtos) {
			featureDto = new ObjectMapper().convertValue(element, FeatureDto.class);
			featureDtoFalsos.add(featureDto);
		}
		
//		when(restTemplate.getForObject(anyString(), ResponseDto.class).getFeatures())
//		     .thenReturn(featureDtoFalsos);
		
		when( restTemplate.getForObject(anyString(), ResponseDto.class).getFeatures() )
		.thenReturn(featureDtoFalsos);
		
//		doReturn(featureDtoFalsos).when( restTemplate.getForObject( anyString(), ResponseDto.class ) ).getFeatures();
		
		// 2.- Act
		List<FeatureDto> features = restTemplate.getForObject(QUERY_GENERAL + QUERY_TIME + START_TIME + timeRequest.getStartTime() + END_TIME + timeRequest.getEndTime(), ResponseDto.class).getFeatures();
		
		// 3.- Assert
		assertEquals(3, features.size());
		
	}

}



































