package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/play-java")
	public String getData(){
		return "SpringBoot Applicating Running With Docker On EC2 Service of AWS";
	}

}
