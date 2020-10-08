package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleMovementController {

	@RequestMapping("/vehicleMovement")
	public String home() {
		
		return "VehicleMovement";
		
	}
	
	
	
	
}
