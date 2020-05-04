package com.abhishek.secureapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String byAll() {
		return ("<h1> Welcome All </h1>");
	}
	
	@RequestMapping("/user")
	public String byuser() {
		return ("<h1> Welcome User </h1>");
	}
	
	@RequestMapping("/admin")
	public String byAdmin() {
		return ("<h1> Welcome Admin </h1>");
	}
	
}
