package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	// It is telling Spring that any HTTP request with the path “/” should be mapped to the index method

	@RequestMapping("/")
	public String helloWorld() {
		return "HelloWorld";
	}

}
