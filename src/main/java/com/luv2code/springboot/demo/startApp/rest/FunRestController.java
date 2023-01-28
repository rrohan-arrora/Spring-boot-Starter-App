package com.luv2code.springboot.demo.startApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello Mother fuckers " + "and whores. Pitty you!";
	}
	
	// expose a new endpoint for "workout"
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "GYM chala jaa bsdk";
	}
	
	@GetMapping("/anoushka")
	public String thePast() {
		return "bahut pachtaegi tu!";
	}
}
