package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.repository.Erepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Econtroller 
{

	@Autowired
	private Erepository er1;
    
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertrecord")
	public Employee insertservice(@RequestBody Employee e)
	{
		return this.er1.save(e);
	}
	
	
	
}
