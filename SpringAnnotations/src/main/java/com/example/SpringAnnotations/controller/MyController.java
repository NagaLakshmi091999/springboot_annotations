package com.example.SpringAnnotations.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public String hello()
	{
		return "Hello my Controler";
	}
}
