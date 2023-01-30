package com.luv2code.springboot.demo.startApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	// defining the properties for which the values are filled
	// using properties file.
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String coachTeam;
	
	
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
	
	@GetMapping("/properties")
	public String showProperties() {
		return ""+coachName + " " + coachTeam;
	}
	
}
