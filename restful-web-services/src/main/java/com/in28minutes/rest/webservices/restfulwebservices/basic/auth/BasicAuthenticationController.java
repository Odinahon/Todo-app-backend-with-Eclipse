package com.in28minutes.rest.webservices.restfulwebservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController 
@CrossOrigin(origins="http://localhost:4200")
public class BasicAuthenticationController {

	//what method -- GET
	//URI - /hello-world
	//method -"Hello World"
	//Controller it is going to handle get request
//	@RequestMapping(method=RequestMethod.GET, path = "/hello-world")
//	public String helloWorld() {
//		return "Hello World!";
//	}

	
	@GetMapping(path = "/basicauth")
	public AuthenticationBean helloWorldBean() {
		return new AuthenticationBean("You are authenticated.");
	}
	//hello-world/path-variable/in28minutes
	
}
