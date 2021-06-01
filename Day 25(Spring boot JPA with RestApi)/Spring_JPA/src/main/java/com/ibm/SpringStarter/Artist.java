package com.ibm.SpringStarter;

import javax.persistence.Id;

@javax.persistence.Entity(name = "Artist")
public class Artist {
	
	@Id
	private Integer id;
	private String name;
	private String Medium;
	public Artist(Integer id, String name, String medium) {
		super();
		this.id = id;
		this.name = name;
		Medium = medium;
	}
	@Override
	public String toString() {
		return "Artist [id=" + id + ", name=" + name + ", Medium=" + Medium + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMedium() {
		return Medium;
	}
	public void setMedium(String medium) {
		Medium = medium;
	}
}
