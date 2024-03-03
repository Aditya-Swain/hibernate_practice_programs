package com.org.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchById {

	public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
			EntityManager em = emf.createEntityManager();
			
			Laptop l = em.find(Laptop.class, 114);
			
			if(l != null) {
				Processor p = l.getP();
				System.out.println("Laptop Details : ");
				System.out.println("Id : "+l.getId());
				System.out.println("Name : "+l.getName());
				System.out.println("Price : "+l.getPrice());
				System.out.println("Storage : "+l.getStorage());
				System.out.println();
				
				System.out.println("Processor Details : ");
				System.out.println("Id : "+p.getId());
				System.out.println("Name : "+p.getPname());
				System.out.println("Core : "+p.getCore());
				System.out.println("=============================");			}
			
		
	}

}
