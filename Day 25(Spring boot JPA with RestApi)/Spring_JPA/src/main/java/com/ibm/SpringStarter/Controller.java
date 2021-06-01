package com.ibm.SpringStarter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/art")
public class Controller {

	@Autowired
	ServiceClass service;
	
	@GetMapping("/artists")
	Iterable<Artist> getAllArtists() {
		return service.getAll(); 
	}
	
	@GetMapping("/artists")
	Object getById(int id) {
		return service.getById(id);
	}
	@PostMapping("/artists")
	void AddArtist(@RequestBody Artist artist) {
		service.AddArtist(artist);
	}
	
	@PutMapping("/artists")
	void UpdateDeatils(@RequestBody Artist artist) {
		service.Update(artist);
	}
	@DeleteMapping("/artist/{id}")
	void DeleteRecord(@PathVariable int id) {
		service.DeleteRecord(id);
	}
	@GetMapping("/penArtist")
	List<Artist> getPenArtist() {
		return service.getPenArtist();
	}
	
}
