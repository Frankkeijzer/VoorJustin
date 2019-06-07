package com.example.workingspirit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.workingspirit.controller.StudentRepository;
import com.example.workingspirit.domein.Student;

@RestController
public class voorbeeldEndpoint {
	@Autowired
	StudentRepository studentRepository;
	
	
	@GetMapping("gaan")
	public String proberen() {
		return "yes2";
	}
	
	@PostMapping("gaan")
	public String proberen2(@RequestBody Student student) {
		System.out.println(student.getVoornaam());
		return "postproberen";
	}
	
	@GetMapping("lopen/{aantalkm}")
	public String kmlopen(@PathVariable int aantalkm) {
		System.out.println("ik loop "+aantalkm+ " km.");
		Student s = new Student();
		s.setVoornaam("Karel");
		studentRepository.save(s);
		return "lopen";
	}
	
	@GetMapping("zwemmen")
	public String zwemmen(@RequestParam int zwembad, @RequestParam String zwemmer) {
		System.out.println(zwembad + " " + zwemmer);
		return "zwemmen";
	}


	@PutMapping("klimmen/{hoogte}")
	public String klimmen(@PathVariable int hoogte) {
		System.out.println(hoogte);
		return "putproberen";
	}
	
	@DeleteMapping("gaan")
	public String proberen4(@RequestBody Student student) {
	System.out.println(student.getVoornaam());
	return "deleteproberen";
	}
	
}
