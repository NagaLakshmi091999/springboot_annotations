package com.example.SpringAnnotations.service;

import org.springframework.stereotype.Component;

@Component
public class VegPizza implements Pizza{
	@Override
	public String getPizza() {
		return "Veg cheese Pizza";
	}

	
}
