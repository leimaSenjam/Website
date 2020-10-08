package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleStatusController {
	@RequestMapping("/vehicleStatus")
	public String home() {
		
		return "VehicleStatus";
		
	}
	
	
	
	
}
