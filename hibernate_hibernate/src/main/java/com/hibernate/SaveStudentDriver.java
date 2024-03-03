package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudentDriver {
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			SaveStudent ss = new SaveStudent();
			
			ss.setId(1);
			ss.setName("aditya");
			ss.setAge(20);
			ss.setCourse("java");
			ss.setEmail("aditya@gmail.com");
			
			et.begin();
			em.persist(ss);
			et.commit();
		}
}
