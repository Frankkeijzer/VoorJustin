package com.example.workingspirit.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.workingspirit.domein.Student;

@Component
public interface StudentRepository extends CrudRepository<Student,Long>{

}
