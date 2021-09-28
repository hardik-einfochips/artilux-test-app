package com.example.artiluxtestapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
* @author Hardik Dobariya
* @since: 05.11.2020
*/
@RestController
public class HelloResource {
	
	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}
	
	@GetMapping("/message")
	public String firstPage() {
		return "App deployed successfully on Azure !";
	}
	
}
