package com.hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
		
public class StudentDao {
		static Scanner os = new Scanner(System.in);	
	//Insert
	public void insert() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		System.out.println("Enter student id,name,age,course and email id to insert");

		SaveStudent std = new SaveStudent();
		
		std.setId(os.nextInt());
		std.setName(os.next());
		std.setAge(os.nextInt());
		std.setCourse(os.next());
		std.setEmail(os.next());
		
		et.begin();
		em.persist(std);
		et.commit();
		System.out.println("Successfully Inserted");
		
	}
	
	
	
	//Fetch
	
	
	public void Fetch() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		System.out.println("Enter the student id to fetch ");
		SaveStudent saveStudent = em.find(SaveStudent.class, os.nextInt());
		
		System.out.println("Id : "+saveStudent.getId());
		System.out.println("Name : "+saveStudent.getName());
		System.out.println("Age : "+saveStudent.getAge());
		System.out.println("Course : "+saveStudent.getCourse());
		System.out.println("Email Id : "+saveStudent.getEmail());
			
		
	}
	
	//Remove
	
	public void Remove() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		System.out.println("Enter the student id to delete");
		SaveStudent saveStudent = em.find(SaveStudent.class, os.nextInt());
		if(saveStudent!=null) {
		et.begin();
		em.remove(saveStudent);
		et.commit();
		System.out.println("Successfully deleted");
		}
		else {
			System.out.println("Id not available");
		}
	}
}
