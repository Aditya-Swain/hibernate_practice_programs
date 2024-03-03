package com.org.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteCarEngine {
			public static void main(String[] args) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
				EntityManager em = emf.createEntityManager();
				EntityTransaction et = em.getTransaction();
				
				Car car  = em.find(Car.class, 1);
				Engine e = car.getE();
				et.begin();
				em.remove(car);
				em.remove(e);
				et.commit();
				System.out.println("successfully deleted");
			}
}
