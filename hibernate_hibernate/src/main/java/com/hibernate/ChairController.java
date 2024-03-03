package com.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ChairController {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");

			public static void main(String[] args) {				
//				saveChair();
				
				List<Chair> list = fetchAllChair();
				
				for(Chair ch : list) {
					System.out.println(ch.getBrand());
					System.out.println(ch.getPrice());
					System.out.println(ch.getColor());
					System.out.println(ch.getCode());
					System.out.println("=============");
				}
			}
			public static void saveChair() {
				EntityManager em = emf.createEntityManager();
				EntityTransaction et = em.getTransaction();
				Chair ch = new Chair();
				ch.setBrand("INDIA");
				ch.setPrice(250);
				ch.setColor("black");
				ch.setCode(null);
				
				et.begin();
				em.persist(ch);
				et.commit();
				System.out.println("Saved successfully");
			}
			
			public static List<Chair> fetchAllChair() {
				EntityManager em = emf.createEntityManager();
				
				String jpql = "select c from Chair c ";
				
				Query query = em.createQuery(jpql);
				
				List<Chair> list = query.getResultList();
				
				return list;
			}
}
