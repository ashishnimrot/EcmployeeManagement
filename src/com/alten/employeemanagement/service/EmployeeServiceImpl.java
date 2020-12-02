package com.alten.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import com.alten.employeemanagement.dao.EmployeeDAO;
import com.alten.employeemanagement.dao.EmployeeDAOImpl;
import com.alten.employeemanagement.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private static EmployeeServiceImpl instance;
	
	private EmployeeDAO employeeDAO = EmployeeDAOImpl.getInstance();
	
	private EmployeeServiceImpl() {
		
	}
	
	public static EmployeeServiceImpl getInstance() {
		if( instance == null) {
			instance	= 	new EmployeeServiceImpl();
		}
		
		return instance;
	}
	
	
	@Override
	public String addEmployee(Employee employee) {
		return employeeDAO.addEmployee(employee);
	}

	@Override
	public String removeEmployee(String empId) {
		return employeeDAO.removeEmployee(empId);
	}

	@Override
	public Optional<Employee> getEmployeeById(String empId) {
		return employeeDAO.getEmployeeById(empId);
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		return employeeDAO.getEmployees();
	}

}
