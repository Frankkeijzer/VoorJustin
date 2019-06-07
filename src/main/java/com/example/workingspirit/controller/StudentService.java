package com.example.workingspirit.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workingspirit.domein.Student;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	StudentRepository sRepository;
	
	public void studentOpslaan() {
		Student tiny = new Student();
		tiny.voornaam = "Tiny";
		sRepository.save(tiny);
	}
}
