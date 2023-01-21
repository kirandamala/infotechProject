package org.infotech.service;

import org.infotech.model.Employee;
import org.infotech.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServices {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee save(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	
	public Employee findById(long id) {
		return this.employeeRepository.findById(id);
		
	}
	
}
