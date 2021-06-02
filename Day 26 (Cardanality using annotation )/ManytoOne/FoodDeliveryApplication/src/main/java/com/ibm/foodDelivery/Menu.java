package com.ibm.foodDelivery;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "Menu")
public class Menu {

	@Id
	private Integer menuID;
	private Integer RestruentID;
	private String name;
	private String category;
	private double amount;
	public Integer getMenuID() {
		return menuID;
	}
	public void setMenuID(Integer menuID) {
		this.menuID = menuID;
	}
	public Integer getRestruentID() {
		return RestruentID;
	}
	public void setRestruentID(Integer restruentID) {
		RestruentID = restruentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Menu [menuID=" + menuID + ", RestruentID=" + RestruentID + ", name=" + name + ", category=" + category
				+ ", amount=" + amount + "]";
	}
	
	Menu(){}
	public Menu(Integer menuID, Integer restruentID, String name, String category, double amount) {
		super();
		this.menuID = menuID;
		RestruentID = restruentID;
		this.name = name;
		this.category = category;
		this.amount = amount;
	}
	
	
}
