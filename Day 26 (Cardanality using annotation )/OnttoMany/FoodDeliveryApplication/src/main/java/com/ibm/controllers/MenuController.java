package com.ibm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.foodDelivery.Menu;
import com.ibm.service.menuService;

@RestController
@RequestMapping("/fds")
public class MenuController {
	
	@Autowired
	menuService service;
	
	@GetMapping("/menu")
	Iterable<Menu> DisplayMenu() {
		return service.getMenu();
	}
	
	@GetMapping("/{Category}")
	List<Menu> getIndianItems(@PathVariable String Category) {
		return service.getIndianItems(Category);
	}
	
}
