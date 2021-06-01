package com.ibm.SpringStarter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceClass {

	@Autowired
	Artist_Repo repo;
	
	Iterable<Artist> getAll() {
		return repo.findAll();
	}

	public Object getById(int id) {
		return repo.findById(id);
	}

	public void AddArtist(Artist artist) {
		repo.save(artist);
	}

	public void Update(Artist artist) {
		repo.save(artist);
		
	}

	public void DeleteRecord(int id) {
		repo.deleteById(id);
	}

	public List<Artist> getPenArtist() {
		return repo.findByPenArtist();
	}

	
}
