package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoodItem {
	@Id
	private Long id;
	private String name;
	private double price;
	private double weight;
}
