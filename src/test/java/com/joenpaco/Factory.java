package com.joenpaco;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.joenpaco.models.dtos.FeatureDto;

public class Factory {

	public static List<FeatureDto> getFeatureDto() {
		
		FeatureDto featureDto;
		
		FeatureDto featureDto2;
		
		FeatureDto featureDto3;
		
		try {
			
			featureDto = new ObjectMapper().readValue("{\"type\":\"Feature\",\"properties\":{\"mag\":1.29,\"place\":\"10km SSW of Idyllwild, CA\",\"time\":1388620296020,\"updated\":1457728844428,\"tz\":-480,\"url\":\"String\",\"detail\":\"String\",\"felt\":null,\"cdi\":null,\"mmi\":null,\"alert\":null,\"status\":\"reviewed\",\"tsunami\":0,\"sig\":26,\"net\":\"ci\",\"code\":\"11408890\",\"ids\":\",ci11408890,\",\"sources\":\",ci,\",\"types\":\",cap,focal-mechanism,general-link,geoserve,nearby-cities,origin,phase-data,scitech-link,\",\"nst\":39,\"dmin\":0.06729,\"rms\":0.09,\"gap\":51,\"magType\":\"ml\",\"type\":\"earthquake\",\"title\":\"M 1.3 - 10km SSW of Idyllwild, CA\"},\"geometry\":{\"type\":\"Point\",\"coordinates\":[-116.7776667,33.6633333,11.008]},\"id\":\"ci11408890\"}", FeatureDto.class);
			
			featureDto2 = new ObjectMapper().readValue("{\"type\":\"Feature\",\"properties\":{\"mag\":1.29,\"place\":\"10km SSW of Idyllwild, CA\",\"time\":1388620296020,\"updated\":1457728844428,\"tz\":-480,\"url\":\"String\",\"detail\":\"String\",\"felt\":null,\"cdi\":null,\"mmi\":null,\"alert\":null,\"status\":\"reviewed\",\"tsunami\":0,\"sig\":26,\"net\":\"ci\",\"code\":\"11408890\",\"ids\":\",ci11408890,\",\"sources\":\",ci,\",\"types\":\",cap,focal-mechanism,general-link,geoserve,nearby-cities,origin,phase-data,scitech-link,\",\"nst\":39,\"dmin\":0.06729,\"rms\":0.09,\"gap\":51,\"magType\":\"ml\",\"type\":\"earthquake\",\"title\":\"M 1.3 - 10km SSW of Idyllwild, CA\"},\"geometry\":{\"type\":\"Point\",\"coordinates\":[-116.7776667,33.6633333,11.008]},\"id\":\"ci11408890\"}", FeatureDto.class);
			
			featureDto3 = new ObjectMapper().readValue("{\"type\":\"Feature\",\"properties\":{\"mag\":1.29,\"place\":\"10km SSW of Idyllwild, CA\",\"time\":1388620296020,\"updated\":1457728844428,\"tz\":-480,\"url\":\"String\",\"detail\":\"String\",\"felt\":null,\"cdi\":null,\"mmi\":null,\"alert\":null,\"status\":\"reviewed\",\"tsunami\":0,\"sig\":26,\"net\":\"ci\",\"code\":\"11408890\",\"ids\":\",ci11408890,\",\"sources\":\",ci,\",\"types\":\",cap,focal-mechanism,general-link,geoserve,nearby-cities,origin,phase-data,scitech-link,\",\"nst\":39,\"dmin\":0.06729,\"rms\":0.09,\"gap\":51,\"magType\":\"ml\",\"type\":\"earthquake\",\"title\":\"M 1.3 - 10km SSW of Idyllwild, CA\"},\"geometry\":{\"type\":\"Point\",\"coordinates\":[-116.7776667,33.6633333,11.008]},\"id\":\"ci11408890\"}", FeatureDto.class);
			
		} catch (IOException e) {
			
			throw new RuntimeException();
			
		}
		
		FeatureDto[] arrayFeatureDto = {featureDto, featureDto2, featureDto3};
		
		List<FeatureDto> featuresDto = Arrays.asList (arrayFeatureDto);

		return featuresDto;
	}

}
