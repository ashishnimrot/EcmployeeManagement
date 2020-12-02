package com.alten.employeemanagement;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import com.alten.employeemanagement.dao.EmployeeDAO;
import com.alten.employeemanagement.dao.EmployeeDAOImpl;
import com.alten.employeemanagement.domain.Employee;
import com.alten.employeemanagement.service.EmployeeService;
import com.alten.employeemanagement.service.EmployeeServiceImpl;

public class Main {
		
	public static void main(String[] args) {
		
		Employee employee = new Employee("1", "AShish", "Nimrot", 100.0f);
		Employee employee1 = new Employee("2", "Sumit", "Nimrot", 200.0f);
		
		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		String result = employeeService.addEmployee(employee);
		employeeService.addEmployee(employee1);
//		System.out.println(result);
		
		Optional<Employee> optional = employeeService.getEmployeeById("1");
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		// Get all employee
		Optional<List<Employee>> optional1 = employeeService.getEmployees();
		if(optional1.isPresent()) {
			System.out.println(optional1.get());
		}
		
		// Delete employee by empId
		String removeResult = employeeService.removeEmployee("1");
		System.out.println(removeResult);
		
		optional1 = employeeService.getEmployees();
		if(optional1.isPresent()) {
			System.out.println(optional1.get());
		}
		
	}
	

}
