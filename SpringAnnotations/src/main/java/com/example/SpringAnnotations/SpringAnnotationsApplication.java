package com.example.SpringAnnotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SpringAnnotations.controller.PizzaController;
import com.example.SpringAnnotations.service.VegPizza;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringAnnotationsApplication.class, args);
		PizzaController pizza = context.getBean(PizzaController.class);
		System.out.println(pizza.getPiza());
		
//		VegPizza vegPizza = context.getBean(VegPizza.class);
//		System.out.println(vegPizza.getPizza());
	}

}
