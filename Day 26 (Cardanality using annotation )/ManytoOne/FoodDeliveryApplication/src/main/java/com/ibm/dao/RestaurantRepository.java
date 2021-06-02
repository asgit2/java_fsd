package com.ibm.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.foodDelivery.Menu;
import com.ibm.foodDelivery.Restaurants;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurants, Integer> {

	List<Menu> findBytheMenuId(Integer rest_Id);

}
