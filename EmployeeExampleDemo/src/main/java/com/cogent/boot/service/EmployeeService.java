package com.cogent.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.boot.entity.Employee;
import com.cogent.boot.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo cr;
	
	public List<Employee> dispRecord() {
		return cr.findAll();
	}

	public Employee addRecord(Employee c) {
		return cr.save(c);
	}
	
}
