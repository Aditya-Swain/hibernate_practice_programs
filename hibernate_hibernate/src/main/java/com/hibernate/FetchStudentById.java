package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchStudentById {
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
			EntityManager em = emf.createEntityManager();
			
			Student student = em.find(Student.class, 1);
			
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getAge());
			
		}
}
