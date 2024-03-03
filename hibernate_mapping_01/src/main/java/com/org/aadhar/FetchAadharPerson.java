package com.org.aadhar;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAadharPerson {
			public static void main(String[] args) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
				EntityManager em = emf.createEntityManager();
				
				String jpql = "select p from Person p";
				Query query = em.createQuery(jpql);
				
				List<Person> list = query.getResultList();
				
				for(Person person : list) {
					System.out.println("PERSON DETAILS : ");
					System.out.println("P Id : "+person.getPid());
					System.out.println("Name : "+person.getName());
					System.out.println("Age : "+person.getAge());
					System.out.println("Address : "+person.getAddress());
					
					System.out.println("AADHAR DETAILS : ");
					System.out.println("Aadhar No. : "+person.getAadhar().getAadharNo());
					System.out.println("===============================");
				}
			}
}
