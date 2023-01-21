package org.infotech.controller;

import org.infotech.model.Employee;
import org.infotech.service.EmployeeServices;
import org.infotech.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	Employee employee;
	
	@Autowired
	EmployeeServices empSerice;
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome Infotech!!!";
	}
	
	
	@PostMapping("/save")
	public Employee save(Employee employee) {
		employee.setAddress("KPHB");
		employee.setDepartmentId("Incometax Dept");
		employee.setEmployeeName("Kiran");
		
		return empSerice.save(employee);
	}
	
	@PostMapping("/findEmployee")
	public Employee findById(Employee employee){
		Long id=(long) 2;
		employee.setId(id);
		
		return empSerice.findById(id);
		
	}
	
	
	
	

}
