package com.example.demo.model;

import java.util.List;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

public class Employee extends Person {
	private String jobPosition;
	
	@ManyToMany
	@JoinTable(
		name="employee_canteen",
		joinColumns = @JoinColumn(name="employee_id"),
		inverseJoinColumns = @JoinColumn(name="canteen_id")
	)
	private List<Canteen> canteens;
}
