package com.in28minutes.rest.webservices.restfulwebservices.helloworld.copy;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String message) {
		this.message = message;
		
	}
 //without the getter method we can have an error There was an unexpected error (type=Internal Server Error, status=500).
//	No converter found for return value of type: class com.in28minutes.rest.webservices.restfulwebservices.HelloWorldBean
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	

}
