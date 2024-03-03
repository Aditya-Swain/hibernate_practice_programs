package com.org.aadhar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdatePersonByAadharNo {
			public static void main(String[] args) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
				EntityManager em = emf.createEntityManager();
				EntityTransaction et = em.getTransaction();
				
				Aadhar aadhar = em.find(Aadhar.class, "888762334000");
				Person person = aadhar.getPerson();
				
				person.setAddress("Gujurat");
				person.setAge(45);
				
				et.begin();
				em.merge(person);
				et.commit();
				System.out.println("Update Changed");
				
}
}
