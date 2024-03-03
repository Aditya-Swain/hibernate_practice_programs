package com.org.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEngine {
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			Engine e = new Engine();
			
			e.seteId(102);
			e.setCc(200);
			e.setEngineName("Turbo2");
			
			et.begin();
			em.merge(e);
			et.commit();
			System.out.println("successfully updated");
		}
}
