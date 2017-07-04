package com.weather.adarsh.services;

import java.rmi.RemoteException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.weather.adarsh.data.entities.City;
import com.weather.adarsh.data.entities.InputParameters;
import com.weather.adarsh.data.entities.ObjectFactory;
import com.weather.adarsh.data.entities.OutputParameters;

import NET.webserviceX.www.GlobalWeatherSoapProxy;
@Component("WeatherService")
public class WeatherService implements IweatherService {

		
		
		public WeatherService(){
			
		}

//		public City getWeather(int cityZip) {
//			City city = new City();
//			city.setCityZip(cityZip);
//			return city;
//		}
		
		  private static final ObjectFactory WS_CLIENT_FACTORY = new ObjectFactory();

		    private WebServiceTemplate webServiceTemplate;

		    @Autowired
		    public WeatherService(WebServiceTemplate webServiceTemplate) {
		        this.webServiceTemplate = webServiceTemplate;
		    }

		    @Override
		    public City getWeather(int cityZip) {
		        InputParameters request = WS_CLIENT_FACTORY
		                .createYourRequest();
		        request.setCityZip(cityZip);
		        
		        OutputParameters response = (OutputParameters) webServiceTemplate
		                .marshalSendAndReceive(request);
		        City city =new City();
		        city.setCityZip(cityZip);

		        return city;
		    }
		public String getCities(String country){
			//request.setCityZip(cityZip);
	        GlobalWeatherSoapProxy gp= new GlobalWeatherSoapProxy();
	        try {
				return gp.getCitiesByCountry(country);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return "No Data";
		}
		
		
}
