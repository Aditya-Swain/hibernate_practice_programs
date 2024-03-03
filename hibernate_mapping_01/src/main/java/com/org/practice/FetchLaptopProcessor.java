package com.org.practice;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchLaptopProcessor {
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
			EntityManager em = emf.createEntityManager();
			
			String jpql = "select l from Laptop l";
			
			Query query = em.createQuery(jpql);
			List<Laptop>list = query.getResultList();
			
			for(Laptop l : list) {
				System.out.println("Laptop Details : ");
				System.out.println("Id : "+l.getId());
				System.out.println("Name : "+l.getName());
				System.out.println("Price : "+l.getPrice());
				System.out.println("Storage : "+l.getStorage());
				System.out.println();
				System.out.println("Processor Details : ");
				System.out.println("Id : "+l.getP().getId());
				System.out.println("Name : "+l.getP().getPname());
				System.out.println("Core : "+l.getP().getCore());
				System.out.println("=============================");
			}
		}
}
