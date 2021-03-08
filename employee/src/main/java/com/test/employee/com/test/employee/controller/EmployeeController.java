package com.test.employee.com.test.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.controller.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/simple")
 public String EmployeeController()
 {
 
 return"hi welocome";
}
 
	@GetMapping("/getallemployees")
	public List<Employee> getall()
	{
		
		Employee emp1=new Employee();
		emp1.setName("rayudu");
		emp1.setId(1);
		
		Employee emp2=new Employee();
		emp2.setName("subbu");
		emp2.setId(2);
		
		
		List<Employee> emplist=new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		
		
	return emplist;
	}
}
