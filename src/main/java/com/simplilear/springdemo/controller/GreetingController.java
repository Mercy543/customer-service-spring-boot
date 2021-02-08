package com.simplilear.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.simplilear.springdemo.model.Greeting;

//@Controller
@RestController
public class GreetingController {

	
	//GET URI : //http://localhost:8080/greet
	
	@GetMapping(path="/greet")
	public String Greeting() {
		return "Welcome to Simplilearn !!!";
		}
	
	//GET URI : //http://localhost:8080/greeting-object
	
		@GetMapping(path="/greeting-object")
	public  Greeting sayHello() {
		return new Greeting ("Welcome to Simplilearn!! Greeting -object testing");
	}
		
		//GET URI : //http://localhost:8080/Hello
		@GetMapping(path="/greeting-object/{message}")
	public Greeting greetPathVariable(@PathVariable ("message") String message) {
		return new Greeting(message);
	}
		
}
