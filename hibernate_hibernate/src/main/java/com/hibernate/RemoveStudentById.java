package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveStudentById {
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			Student student = em.find(Student.class, 20);
			
			if(student!=null) {
				et.begin();
				em.remove(student);
				et.commit();
				System.out.println("Student data successfully deleted");
			}
			else {
				System.out.println("Student is not present");
			}
		}
}
