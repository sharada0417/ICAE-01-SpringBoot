package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderLine {
	@Id
	private Long id;
	private int quality;
	
}
