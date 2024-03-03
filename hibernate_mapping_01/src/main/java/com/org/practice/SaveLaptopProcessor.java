package com.org.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveLaptopProcessor {
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			Laptop lap = new Laptop();
			
			lap.setId(114);
			lap.setName("MAC BOOK");
			lap.setPrice(97000);
			lap.setStorage("1TB");
			
			Processor psr = new Processor();
			
			psr.setId(4);
			psr.setPname("Apple M1");
			psr.setCore(12);
			lap.setP(psr);
			
			et.begin();
			em.persist(psr);
			em.persist(lap);
			et.commit();
			System.out.println("Data inserted ");
		}
}
