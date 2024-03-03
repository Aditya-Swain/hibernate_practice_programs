package com.org.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEngine {
			public static void main(String[] args) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
				EntityManager em = emf.createEntityManager();
				EntityTransaction et = em.getTransaction();
				
				Engine engine = em.find(Engine.class, 101);
				
				et.begin();
				em.remove(engine);
				et.commit();
				System.out.println("successfully deleted");
			}
}
