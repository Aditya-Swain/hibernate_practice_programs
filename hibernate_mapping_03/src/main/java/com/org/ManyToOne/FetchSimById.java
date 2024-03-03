package com.org.ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchSimById {
			public static void main(String[] args) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
				EntityManager em = emf.createEntityManager();
				
				
				Sim sim = em.find(Sim.class, 101);
				if(sim != null) {
				System.out.println("Sim Id : "+sim.getId());
				System.out.println("Service Provider : "+sim.getProvider());
				System.out.println("Number : "+sim.getNumber());
				System.out.println("Mobile : "+sim.getMobile());
			}
			}
}
