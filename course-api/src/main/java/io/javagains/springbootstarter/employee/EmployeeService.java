package io.javagains.springbootstarter.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployee(String id) {
		return employeeRepository.findByEmpid(id);
	}

	
	
}

