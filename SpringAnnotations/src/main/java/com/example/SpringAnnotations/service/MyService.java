package com.example.SpringAnnotations.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	public String hello()
	{
		return "Hello my Service";
	}

}
