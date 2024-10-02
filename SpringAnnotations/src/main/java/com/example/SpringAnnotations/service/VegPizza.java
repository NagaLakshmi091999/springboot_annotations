package com.example.SpringAnnotations.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
public class VegPizza implements Pizza{
	@Override
	public String getPizza() {
		return "Veg cheese Pizza";
	}

	
}
