package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/getClient1")
	public String getDoctorService() {
		return "client1 microservice called...";
	}
}
