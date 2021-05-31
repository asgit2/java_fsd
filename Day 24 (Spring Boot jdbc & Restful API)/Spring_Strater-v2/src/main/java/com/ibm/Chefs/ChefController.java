package com.ibm.Chefs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChefController {

	ArrayList<Chefs> ListOfChefs = new ArrayList<>(
			Arrays.asList(new Chefs(1,"Abhishek","Indian",5),
			new Chefs(2, "Yadav", "Chicken Special", 12)));
	
	@RequestMapping("/chefs")
	List<Chefs> getChefs(){
		return ListOfChefs;
	}
	
	@RequestMapping("/chefs/{id}")
	Chefs getChefById(@PathVariable int id) {
		return ListOfChefs.stream().filter(ref -> ref.getId(). equals(id)).findFirst().get();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/chefs")
	void addNewChef(@RequestBody Chefs theChef) {
		ListOfChefs.add(theChef);
	}
}
