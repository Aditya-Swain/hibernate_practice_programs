package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {
			public static void main(String[] args) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
				EntityManager em = emf.createEntityManager();
				EntityTransaction et = em.getTransaction();
				
				Student std = new Student();
				
				std.setId(4);
				std.setAge(12);
				std.setName("yahiko");
				
				et.begin();
				em.persist(std);
				et.commit();
				System.out.println("Data Stored Successfully");
				
			}
}
