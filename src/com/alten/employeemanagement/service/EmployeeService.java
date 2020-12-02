package com.alten.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import com.alten.employeemanagement.domain.Employee;

public interface EmployeeService {
	public String addEmployee(Employee employee);
	public String removeEmployee(String empId);
	public Optional<Employee> getEmployeeById(String empId);
	public Optional<List<Employee>> getEmployees();  
}
