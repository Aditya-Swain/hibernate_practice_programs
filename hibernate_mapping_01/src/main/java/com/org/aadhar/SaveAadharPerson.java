package com.org.aadhar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveAadharPerson {
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			Person person = new Person();
			
			person.setName("Aditya");
			person.setAge(20);
			person.setAddress("Kodala");
			
			Aadhar aadhar = new Aadhar();
			aadhar.setAadharNo("890944034000");
			
			aadhar.setPerson(person);
			person.setAadhar(aadhar);
			
			et.begin();
			em.persist(person);
			em.persist(aadhar);
			et.commit();
			System.out.println("data inserted");
			
		}
}
