package com.ibm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.foodDelivery.Menu;

@Repository
public interface MenuRepository extends CrudRepository<Menu, Integer> {


	List<Menu> findBycategory(String category);

}
