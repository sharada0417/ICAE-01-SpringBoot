package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Canteen {
	@Id
	private Long id;
	
	private String name;
	private String Location;
	
	@ManyToMany(mappedBy = "canteens")
	private List<Employee> employees;
	
	@OneToMany
	private List<DailyMenu> dailyMenus;
	
}
