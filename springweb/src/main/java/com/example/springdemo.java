package com.example;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller



public class springdemo {

	@RequestMapping("/")
	public String welcome() {
		return "index";
	}

	
}
