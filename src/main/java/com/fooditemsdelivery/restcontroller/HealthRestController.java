package com.fooditemsdelivery.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthRestController {

	
	@Value( "${greetings.message:Hey}" )
	private String greetingsMessage;
	
	@Value( "${application.health.message:UP}" )
	private String appHealthMessage;
	
	
	@GetMapping(path="/health", produces = "application/json")
	public String checkHealth() {
		return  "{\"Message\":\"" + appHealthMessage + "\"}";
	}
	
	@GetMapping(path="/", produces = "application/json")
	public String entryPointURL() {
		return  "{\"Message\":\"" + greetingsMessage + "\"}";
	}
}
