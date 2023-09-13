package com.healpio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@PostMapping(value = "/android", consumes = "application/json")
    public void receiveLocation(@RequestBody String locationData) {
        System.out.println("Received Location Data: " + locationData);
    }

	@RequestMapping(value="main.do")
	public String initMain() {
		return "main/main";
	}
	
	@GetMapping("/intro")
	public String intro() {
		return "main/intro";
	}
	
}
