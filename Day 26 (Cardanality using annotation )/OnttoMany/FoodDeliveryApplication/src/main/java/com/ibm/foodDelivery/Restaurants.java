package com.ibm.foodDelivery;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

@Entity(name="Restaurants")
public class Restaurants {

	@Id
	private Integer Rest_Id;
	private String name;
	private String Address;
	private String city;
	private String State;
	private Integer PhoneNo;
//	
//	@ManyToOne
//	private Menu theMenu;
	
	@OneToMany
	List<Menu> theMenu = new ArrayList<>();
	
	public List<Menu> getTheMenu() {
		return theMenu;
	}
	public void setTheMenu(List<Menu> theMenu) {
		this.theMenu = theMenu;
	}
	//	
//	public Menu getTheMenu() {
//		return theMenu;
//	}
//	public void setTheMenu(Menu theMenu) {
//		this.theMenu = theMenu;
//	}
	public Integer getRest_Id() {
		return Rest_Id;
	}
	public void setRest_Id(Integer rest_Id) {
		Rest_Id = rest_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Integer getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(Integer phoneNo) {
		PhoneNo = phoneNo;
	}
//	@Override
//	public String toString() {
//		return "Restaurants [Rest_Id=" + Rest_Id + ", name=" + name + ", Address=" + Address + ", city=" + city
//				+ ", State=" + State + ", PhoneNo=" + PhoneNo + ", theMenu=" + theMenu + "]";
//	}
	public Restaurants() {}
	public Restaurants(Integer rest_Id, String name, String address, String city, String state, Integer phoneNo) {
		super();
		Rest_Id = rest_Id;
		this.name = name;
		Address = address;
		this.city = city;
		State = state;
		PhoneNo = phoneNo;
	}
//	public Restaurants(Integer rest_Id, String name, String address, String city, String state, Integer phoneNo,
//			Menu theMenu) {
//		super();
//		Rest_Id = rest_Id;
//		this.name = name;
//		Address = address;
//		this.city = city;
//		State = state;
//		PhoneNo = phoneNo;
//		this.theMenu = theMenu;
//	}
	
	
	
}
