package com.example.SpringAnnotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.SpringAnnotations.service.Pizza;

@Component
public class PizzaController {
	
	Pizza pizza; // to acheve loosly coupling we are using interface fiels autowired
	
	@Autowired
	public PizzaController(Pizza vegPizza) {
		this.pizza = vegPizza;
	}
	
//	@Autowired
//	public void setPizza(VegPizza pizza) {
//		this.vegPizza= pizza;
//	}
	
	public String getPiza() {
		return pizza.getPizza();
	}

}
