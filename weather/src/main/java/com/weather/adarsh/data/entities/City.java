package com.weather.adarsh.data.entities;

public class City {

	private Long cityId;

	private String cityName;

	private String cityDescription;

	private int cityZip;

	private int cityTemp;
	
	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityDescription() {
		return cityDescription;
	}

	public void setCityDescription(String cityDescription) {
		this.cityDescription = cityDescription;
	}

	public int getCityZip() {
		return cityZip;
	}

	public void setCityZip(int i) {
		this.cityZip = i;
	}

	public int getCityTemp() {
		return cityTemp;
	}

	public void setCityTemp(int cityTemp) {
		this.cityTemp = cityTemp;
	}

	@Override
	public String toString() {
		return "Project [cityId=" + cityId + ", cityName=" + cityName + ", cityDescription=" + cityDescription
				+ ", cityZip=" + cityZip + ", cityTemp=" + cityTemp + "]";
	}

	
	

}
