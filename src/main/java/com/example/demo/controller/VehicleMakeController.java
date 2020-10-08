package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleMakeController {

	@RequestMapping("/vehicleMake")
	public String home() {
		
		return "VehicleMake";
		
	}
	
	
	
	
}
