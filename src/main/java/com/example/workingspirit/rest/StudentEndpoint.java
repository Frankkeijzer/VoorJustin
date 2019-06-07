package com.example.workingspirit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workingspirit.controller.StudentService;

@RestController
public class StudentEndpoint {
	
	@Autowired
	StudentService sService;
	
	@GetMapping("hallo")
	public String go() {
			System.out.println("ff checken");
			sService.studentOpslaan();
			return "Nieuwe tekst van mij";
	}
}
