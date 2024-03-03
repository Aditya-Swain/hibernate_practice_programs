package com.org.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.org.dto.Employee;

public class EmployeeDao {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
	
//save Employee
	
	
	public void saveEmployee(Employee emp) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(emp);
		et.commit();
	}
	
//Delete Employee By Id
	
	public boolean deleteEmployeeById(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Employee emp = em.find(Employee.class, id);
		
		
		if(emp==null)
			return false;
		et.begin();
		em.remove(emp);
		et.commit();
		
		return true;
	}
	
	//Search employee by id
	
	public Employee SearchEmployeeById(int id) {
		
		EntityManager em = emf.createEntityManager();
		
		Employee employee = em.find(Employee.class, id);
		
		return employee;
		
	}
	
	
	//Fetch all employee
	
	public List<Employee> fetchAllEmployee(){
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select e from Employee e ";
		
		Query query = em.createQuery(jpql);
		
		List<Employee> list = query.getResultList();
		
		return list;
	}
	
	//Update Employee By Id
	
	public void updateEmployeeById(int id, Employee emp) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String name = emp.getName();
		int age = emp.getAge();
		String email = emp.getEmail();
		long mobile = emp.getMobile();
		String pwd = emp.getPassword();
		emp.setId(id);
		emp.setName(name);
		emp.setAge(age);
		emp.setEmail(email);
		emp.setMobile(mobile);
		emp.setPassword(pwd);
		
		et.begin();
		em.merge(emp);
		et.commit();
		
	}
	
	
	//Verify Employee
	
	public boolean verifyEmployee(String email,String pwd) {
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select e from Employee e where e.email=?1 and password=?2";
		
		Query query = em.createQuery(jpql);
		query.setParameter(1, email);
		query.setParameter(2, pwd);
		
		List<Employee> list = query.getResultList();
		for(Employee e : list) {
		if(e.getEmail()!=null)
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
