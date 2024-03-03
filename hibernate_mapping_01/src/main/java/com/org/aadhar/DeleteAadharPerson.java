package com.org.aadhar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteAadharPerson {
			public static void main(String[] args) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
				EntityManager em = emf.createEntityManager();
				EntityTransaction et = em.getTransaction();
				
				Aadhar aadhar = em.find(Aadhar.class, "888744334000");
				Person person = aadhar.getPerson();
				
				et.begin();
				em.remove(person);
				em.remove(aadhar);
				et.commit();
				System.out.println("data deleted");
			}
}
