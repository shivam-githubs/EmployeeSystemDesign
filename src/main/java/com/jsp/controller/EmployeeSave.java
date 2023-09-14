package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class EmployeeSave {
	public static void main(String[] args) {
		Employee employee =new Employee();
		employee.setName("purva");
		employee.setEmail("purva@gmail.com");
		employee.setCno(702145495l);
		EmployeeService employeeService =new EmployeeService();
		employeeService.saveEmplyee(employee);
	}
}
