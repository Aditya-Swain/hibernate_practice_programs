package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateStudent {
				public static void main(String[] args) {
					EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
					EntityManager em = emf.createEntityManager();
					EntityTransaction et = em.getTransaction();
					
					Student std = new Student();
					std.setId(2);
					std.setAge(23);
					std.setName("tobirama");
					
					et.begin();
					em.merge(std);
					et.commit();
					System.out.println("Updated successfully");
				}
}
