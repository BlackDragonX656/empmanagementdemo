package com.cogent.boot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.boot.entity.Employee;
import com.cogent.boot.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	EmployeeService cs;
	
	@GetMapping("/getallemployees")
	public List<Employee> getRecords(){
		return cs.dispRecord();
	}
	
	@PostMapping("/addemployee")
	public Employee addRecord(@Valid @RequestBody Employee c){
		return cs.addRecord(c);
	}
}
