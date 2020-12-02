package com.alten.employeemanagement.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee {
	
	private String empId;
	private String empFirstName;
	private String empLastName;
	private float empSalary;

}
