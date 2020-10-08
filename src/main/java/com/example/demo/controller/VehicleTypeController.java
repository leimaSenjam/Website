package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleTypeController {

	@RequestMapping("/vehicleType")
	public String home() {
		
		return "VehicleType";
		
	}
	
	
	
}
