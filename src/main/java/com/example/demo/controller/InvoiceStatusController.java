package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvoiceStatusController {

	@RequestMapping("/invoiceStatus")
	public String home() {
		
		return "InvoiceStatus";
		
	}
	
	
	
}
