package com.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllStudent {
		public static void main(String[] args) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
				EntityManager em = emf.createEntityManager();
				
				String jpql = "SELECT s FROM Student s";
				
				Query query = em.createQuery(jpql);
				
				List<Student> list = query.getResultList();
				for(Student s1 : list) {
					
					System.out.println("Id : "+s1.getId());
					System.out.println("Name : "+s1.getName());
					System.out.println("Age : "+s1.getAge());
					System.out.println("========================");
				}
				
				
		}
}