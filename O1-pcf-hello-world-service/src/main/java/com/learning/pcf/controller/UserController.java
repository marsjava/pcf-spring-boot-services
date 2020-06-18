package com.learning.pcf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.pcf.model.User;

@RestController
@RequestMapping("/users")
public class UserController {
	@GetMapping("/say-hello")
	public String sayHello() {
		return "Welcome back to - Spring boot Hello world";
	}
	@GetMapping("/say-hello-bean")
	public User sayHelloBean() {
		return new User("Bean Constructor say, Hello world");
	}
	@GetMapping("/say-hello-bean/{message}")
	public User sayHelloBeanParam(@PathVariable String message) {
		return new User(String.format("Hello world, %s", message));
	}
}
