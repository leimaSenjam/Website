package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleMaintenanceController {

	@RequestMapping("/vehicleMaintenance")
	public String home() {
		
		return "VehicleMaintenance";
		
	}
	
	
	
}
