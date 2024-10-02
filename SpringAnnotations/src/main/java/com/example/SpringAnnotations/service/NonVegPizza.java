package com.example.SpringAnnotations.service;

import org.springframework.stereotype.Component;


public class NonVegPizza implements Pizza{

	@Override
	public String getPizza() {
		// TODO Auto-generated method stub
		return "Non-Veg Pizza";
	}

}
