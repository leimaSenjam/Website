package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleController {

	@GetMapping("/vehicle")
	public String getCountries() {
		
		return "Vehicle";
		
	}
	
	
	
}
