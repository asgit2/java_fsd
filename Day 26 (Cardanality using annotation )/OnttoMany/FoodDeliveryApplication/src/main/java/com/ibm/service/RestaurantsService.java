package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.dao.RestaurantRepository;
import com.ibm.foodDelivery.Menu;
import com.ibm.foodDelivery.Restaurants;

@Service
public class RestaurantsService {
	
	@Autowired
	RestaurantRepository repo;
	
	public Iterable<Restaurants> getAllRestaurants() {
		return repo.findAll();
	}
	
	public List<Menu> getMenuByRestaurant(int Rest_Id) {
		return repo.findBytheMenuId(Rest_Id);
	}
}
