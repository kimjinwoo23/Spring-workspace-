package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {
	@GetMapping("example")
	public String 이그잼플메서드() {
		return "example";
	}
	
}
