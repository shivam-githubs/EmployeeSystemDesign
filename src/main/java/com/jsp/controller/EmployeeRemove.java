package com.jsp.controller;

import com.jsp.service.EmployeeService;

public class EmployeeRemove {

	public static void main(String[] args) {
		EmployeeService employeeService =new EmployeeService();
		employeeService.deleteEmployee(2);

	}

}
