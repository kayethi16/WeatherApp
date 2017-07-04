package com.weather.adarsh.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.weather.adarsh.data.entities.City;
import com.weather.adarsh.services.WeatherService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		City city =new City();
		city.setCityName("Dekalb");
		city.setCityZip(60115);
		city.setCountry("Iraq");
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("city",city);
		
		return "home";
	}
	@Autowired
	private WeatherService weatherService;

	/*@RequestMapping(value="/{cityZip}")
	public String findProject(Model model, @PathVariable("cityZip") int cityZip){
		model.addAttribute("city", this.weatherService.getWeather(cityZip));
		return "cities";
	}*/
	@RequestMapping(value="/city")
	@ResponseBody
	public String findCities(Model model, @RequestParam("country") String cityZip){
		System.out.println("givenZip"+cityZip);
		//model.addAttribute("cities", this.weatherService.getWeather(cityZip));
		System.out.println( this.weatherService.getCities(cityZip));
		LinkedList<City> list = getList();
		System.out.println(list.toString());
	    ModelAndView map = new ModelAndView("cities");
	    map.addObject("cities", list);
		return this.weatherService.getCities(cityZip);
	}
	
	/*@RequestMapping(value={"/employee"}, method = RequestMethod.GET)
	public String listEmployee(){    
	    System.out.println("Kontroler EmployeeController");
	    LinkedList<City> list = getList();
	    ModelAndView map = new ModelAndView("index");
	    map.addObject("lists", list);

	    return map.getViewName();
	}*/

	private LinkedList<City> getList(){
	    LinkedList<City> list = new LinkedList<City>();
	    City c1 = new City();
	    c1.setCityName("c1");
	    City c2 = new City();
	    c1.setCityName("c2");

	    list.add(c1);
	    list.add(c2);
	    //list.add("Item 3");

	    return list;
	}

}
