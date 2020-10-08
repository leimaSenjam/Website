package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {

	@RequestMapping("/location")
	public String home() {
		
		return "Location";
		
	}
	
	
	
}
