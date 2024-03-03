package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateTeacher {
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			Teacher t = new Teacher();
			
			t.setId(2);
			t.setEmail("zeeshan@gmail.com");
			t.setName("zeeshan");
			
			et.begin();
			em.merge(t);
			et.commit();
			
		}
}
