package com.example.SpringAnnotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.SpringAnnotations.controller.PizzaController;
import com.example.SpringAnnotations.service.NonVegPizza;
import com.example.SpringAnnotations.service.Pizza;
import com.example.SpringAnnotations.service.VegPizza;

@Configuration
public class AppConfig {
	@Bean
	public Pizza vegPizza() {
		return new VegPizza();
	}

	@Bean
	public Pizza nonVegPizza() {
		return new NonVegPizza();
	}

	@Bean
	public PizzaController pizzaController() {
		return new PizzaController(nonVegPizza());
	}

}
