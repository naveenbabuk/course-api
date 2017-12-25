package io.javagains.springbootstarter.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
		
	}
	
	@RequestMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return employeeService.getEmployee(id);
		
	}
	
}
