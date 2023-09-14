package com.jsp.service;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class EmployeeService {
	
	EmployeeDao employeeDao =new EmployeeDao();
	
	public Employee saveEmplyee(Employee employee)
	{
		return employeeDao.saveEmplyee(employee);
	}
	public Employee deleteEmployee(int id)
	{
		return employeeDao.deleteEmployee(id);
	}
	
	public Employee updateEmployee(int id, Employee employee)
	{
		return employeeDao.updateEmployee(employee,id);
	}
	
	public Employee getEmployee(int id)
	{
		return employeeDao.getEmployee(id);
	}
	
	public List<Employee> getAllEmployee()
	{
		return employeeDao.getAllEmployee();
	}
}
