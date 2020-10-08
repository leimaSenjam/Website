package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeTypeController {

	@RequestMapping("/employeeType")
	public String home() {
		
		return "EmployeeType";
		
	}
	
	
	
	
	
}
