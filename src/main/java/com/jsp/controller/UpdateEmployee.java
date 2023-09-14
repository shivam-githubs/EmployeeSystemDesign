package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class UpdateEmployee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee =new Employee();
		employee.setName("Shivam ");
		employee.setEmail("shivam@mail.com");
		employee.setCno(7021695l);
		EmployeeService employeeService =new EmployeeService();
		employeeService.updateEmployee(1,employee);
		
	}

}
