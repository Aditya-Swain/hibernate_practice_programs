package com.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchStudentByAge {
				
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
			EntityManager em = emf.createEntityManager();
			String jpql = "select a from Student a where a.age=?1";
			
			Query query = em.createQuery(jpql);
			
			query.setParameter(1, 12);
			
			List<Student> list = query.getResultList();
			
			for(Student s : list) {
				System.out.println("Id  : "+s.getId());
				System.out.println("Name  : "+s.getName());
				System.out.println("Age  : "+s.getAge());
				System.out.println("=================");
			}
		}
}
