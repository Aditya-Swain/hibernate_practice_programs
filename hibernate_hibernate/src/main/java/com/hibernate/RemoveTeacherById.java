package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveTeacherById {
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			Teacher teacher = em.find(Teacher.class, 2);
			
			if(teacher != null) {
				et.begin();
				em.remove(teacher);
				et.commit();
				System.out.println("Successfully Deleted");
			}
			else {
				System.out.println("Teacher is not available");
			}
		}
}
