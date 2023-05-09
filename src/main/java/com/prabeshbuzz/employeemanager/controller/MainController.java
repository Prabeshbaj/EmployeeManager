package com.prabeshbuzz.employeemanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	@GetMapping("home")
	public String getHomePage() {
		return "Welcome to the homepage";
	}
}
