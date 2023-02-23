package com.example.demo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository emp;
	
	
	@PostMapping("/saveEmployee")
	public String saveEmployee( @RequestBody Employee employee)
	{
		emp.save(employee);
		return "Employee saved";
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAll()
	{
		return emp.findAll();
	}
	
	@GetMapping("/getEmployee/{dept}")
	public List<Employee> getEmployeesByDept(@PathVariable String dept)
	{
		return emp.findByDept(dept);
	}
	
	@GetMapping("/getEmployeebyStatusAndDate")
	public List<Employee> getEmployeesByDept() throws ParseException
	{
		System.out.println("its working");
		Date d = new SimpleDateFormat("yyyy-MM-dd").parse("2018-03-05");
		
		String s = "CREATED";
		System.out.println(d.toString());
		
		return emp.pablo("2018-03-18", s);
	}
	
}
