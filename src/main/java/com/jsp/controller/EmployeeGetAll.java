package com.jsp.controller;

import com.jsp.service.EmployeeService;

public class EmployeeGetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService employeeService =new EmployeeService();
		employeeService.getAllEmployee();
	}

}
