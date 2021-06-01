package com.ibm.SpringStarter;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Artist_Repo extends CrudRepository<Artist, Integer> {

	@Query("SELECT * from Artist where Medium=pen")
	List<Artist> findByPenArtist();

}
