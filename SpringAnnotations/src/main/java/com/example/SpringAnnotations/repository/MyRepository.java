package com.example.SpringAnnotations.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
	
	public String hello()
	{
		return "Hello my Repository";
	}

}
