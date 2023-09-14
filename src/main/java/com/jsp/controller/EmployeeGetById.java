package com.jsp.controller;

import com.jsp.service.EmployeeService;

public class EmployeeGetById {

	public static void main(String[] args) {
		EmployeeService employeeService =new EmployeeService();
		employeeService.getEmployee(1);

	}

}
