package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.dao.MenuRepository;
import com.ibm.foodDelivery.Menu;

@Service
public class menuService {
	
	@Autowired
	MenuRepository repo;

	public Iterable<Menu> getMenu() {
		return repo.findAll();
	}

	public List<Menu> getIndianItems(String category) {
		return repo.findBycategory(category);
	}
	
	
	
}
