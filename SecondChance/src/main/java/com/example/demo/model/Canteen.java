package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Canteen {
	@Id
	private Long id;
	
	private String name;
	private String Location;
	
}
