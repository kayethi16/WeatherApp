package com.weather.adarsh.services;

import com.weather.adarsh.data.entities.City;

public interface IweatherService {

	public City getWeather(int cityZip);

}