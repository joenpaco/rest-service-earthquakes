package com.joenpaco.models.dtos;

public class MagnitudeRequest {
	
	private float minMagnitude;
	
	private float maxMagnitude;

	public MagnitudeRequest() {
	}

	public float getMinMagnitude() {
		return minMagnitude;
	}

	public void setMinMagnitude(float minMagnitude) {
		this.minMagnitude = minMagnitude;
	}

	public float getMaxMagnitude() {
		return maxMagnitude;
	}

	public void setMaxMagnitude(float maxMagnitude) {
		this.maxMagnitude = maxMagnitude;
	}

}
