package com.alten.employeemanagement.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.alten.employeemanagement.domain.Employee;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class EmployeeDAOImpl implements EmployeeDAO{

    private static EmployeeDAOImpl employeeDAOImpl; 
    private List<Employee> employees = new ArrayList<>();
    
    private EmployeeDAOImpl() {
	}
    
    public static EmployeeDAOImpl getInstance() {
    	if(employeeDAOImpl == null) {
    		employeeDAOImpl = new EmployeeDAOImpl();
    	}
    	return employeeDAOImpl;
	}
	
	@Override
	public String addEmployee(Employee employee) {
		if(employees.add(employee))
			return "Add Success!";
			return "Add Falied!";
	}

	@Override
	public String removeEmployee(String empId) {
		Optional<Employee> optional = employees.stream().filter(e->e.getEmpId().equals(empId)).findFirst();
		if(optional.isPresent() && employees.remove(optional.get()))
			return "Remove Success!";
			return "Remove Falied!";
	}

	@Override
	public Optional<Employee> getEmployeeById(String empId) {
		return employees.stream().filter(e->e.getEmpId().equals(empId)).findFirst();
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		return Optional.ofNullable(employees);
	}

}
