package com.ibm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.foodDelivery.Menu;
import com.ibm.foodDelivery.Restaurants;
import com.ibm.service.RestaurantsService;

@RestController
@RequestMapping("/fds")
public class RestaurantController {
	
	@Autowired
	RestaurantsService service;
	
	@RequestMapping("/restaurant")
	Iterable<Restaurants> getAllRestaurants() {
		return service.getAllRestaurants();
	}
	@RequestMapping("/restaurant/{Rest_Id}")
	List<Menu> getMenuBytheRestaurant(int Rest_Id) {
		return service.getMenuByRestaurant(Rest_Id);
	}
	
}
