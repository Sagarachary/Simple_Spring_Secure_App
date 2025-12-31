package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestControllerDemo {
	
	@GetMapping("/show")
	public Map<String, String> showData() {
		Map<String, String> response = new HashMap<>();
		response.put("Message", "Hello welcome to my app");
		response.put("role", "User");
		return response;
	}
	
	@GetMapping("/dontshow")
	public Map<String, String> dontshowData() {
		Map<String, String> response = new HashMap<>();
		response.put("Message", "Hello welcome to my app");
		response.put("role", "User");
		return response;
	}
}
