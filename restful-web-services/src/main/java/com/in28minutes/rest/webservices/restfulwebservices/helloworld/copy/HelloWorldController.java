package com.in28minutes.rest.webservices.restfulwebservices.helloworld.copy;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController 
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {

	//what method -- GET
	//URI - /hello-world
	//method -"Hello World"
	//Controller it is going to handle get request
//	@RequestMapping(method=RequestMethod.GET, path = "/hello-world")
//	public String helloWorld() {
//		return "Hello World!";
//	}
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World! Odina!");
	}
	//hello-world/path-variable/in28minutes
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
//		throw new RuntimeException("Something went wrong");
		return new HelloWorldBean(String.format("Hello World, %s",name));
	}
}
