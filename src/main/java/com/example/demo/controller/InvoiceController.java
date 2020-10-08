package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvoiceController {

	@RequestMapping("/invoice")
	public String home() {
		
		return "Invoice";
		
	}
	
	
	
	
}
