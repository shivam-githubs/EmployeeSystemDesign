package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.dto.Employee;

public class EmployeeDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shivam");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();	
	
	//to save
	public Employee saveEmplyee(Employee employee)
	{
	
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
	}
	
	
	//to delete
	public Employee deleteEmployee(int id)
	{
		Employee employee =entityManager.find(Employee.class, id);
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
		return employee;
	}
	
	//to update 
	public Employee updateEmployee(Employee employee1,int id  )
	{
		
		entityTransaction.begin();
		 Employee employee = entityManager.find(Employee.class, id);
		 if (employee != null) {
		        employee.setName(employee1.getName());
		        employee.setEmail(employee1.getEmail());
		        employee.setCno(employee1.getCno()); 
		    }
		 entityTransaction.commit();
		    
		    return employee;
	}
	
	//to getById
	public Employee getEmployee(int id)
	{
		Employee employee= entityManager.find(Employee.class, id);
		System.out.println(employee.getId());
		System.out.println(employee.getEmail());
		System.out.println(employee.getCno());
		System.out.println(employee.getName());
		return employee;
	}
	
	
	//to getAll
	public List<Employee> getAllEmployee()
	{
		String sql = "SELECT e FROM Employee e";
		Query query= entityManager.createQuery(sql);
		List <Employee> employees = query.getResultList();
		for(Employee f : employees)
		{
			System.out.println("====1===============");
			System.out.println(f.getId());
			System.out.println(f.getName());
			System.out.println(f.getCno());
			System.out.println(f.getEmail());
		}return query.getResultList();
	}
}
