package com.org.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCarEngine {
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
				
			Car car = new Car();
			car.setBrand("LAMBORGHINI");
			car.setColor("blue");
			
			Engine engine = new Engine();
			engine.seteId(103);
			engine.setCc(999);
			engine.setEngineName("Turbo X");
			car.setE(engine);
			
			
			
			et.begin();
			em.persist(car);
			em.persist(engine);
			et.commit();
			System.out.println("Data inserted");
		}
}
