package com.joenpaco.models.dtos;

public class EarthquakeDto {
	
	private int count;
	
	private int maxAllowed;

	public EarthquakeDto() {
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMaxAllowed() {
		return maxAllowed;
	}

	public void setMaxAllowed(int maxAllowed) {
		this.maxAllowed = maxAllowed;
	}

}
