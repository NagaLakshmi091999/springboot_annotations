package com.example.SpringAnnotations.service;

import org.springframework.stereotype.Component;

@Component
public class VegPizza {
	public String getPizza() {
		return "Veg cheese Pizza";
	}
}
