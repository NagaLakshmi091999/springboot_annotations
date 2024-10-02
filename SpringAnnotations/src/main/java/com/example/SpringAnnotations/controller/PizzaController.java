package com.example.SpringAnnotations.controller;

import org.springframework.stereotype.Component;

@Component
public class PizzaController {
	
	public String getPiza() {
		return "Cheese Pizza";
	}

}
