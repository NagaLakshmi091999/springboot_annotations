package com.example.SpringAnnotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.SpringAnnotations.service.VegPizza;

@Component
public class PizzaController {
	@Autowired
	VegPizza vegPizza;
	
//	@Autowired
//	public PizzaController(VegPizza vegPizza) {
//		this.vegPizza = vegPizza;
//	}
	
//	@Autowired
//	public void setPizza(VegPizza pizza) {
//		this.vegPizza= pizza;
//	}
	
	public String getPiza() {
		return vegPizza.getPizza();
	}

}
