package com.org.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateCarEngine {
			public static void main(String[] args) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
				EntityManager em = emf.createEntityManager();
				EntityTransaction et = em.getTransaction();
				
				
				Car car = em.find(Car.class, 3);
				Engine engine = car.getE();
				car.setColor("red");
				engine.setCc(600);
				
				et.begin();
				em.merge(car);
				em.merge(engine);
				et.commit();
				System.out.println("Successfully updated");
			}
}
