package com.hibernate.practice;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class LaptopDriver {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");

			public static void main(String[] args) {
				Laptop l = new Laptop();
				l.setBrand("Dell");
				l.setColor("Black");
				l.setPrice(50000);
				l.setProcessor("Intel Core");
				l.setStorage("1TB");
				l.setModelNo("DB3897NV54");
				
				saveLaptop(l);
				
				List<Laptop> list = fetchAllLaptop();
				for(Laptop lap : list) {
					System.out.println("Id : "+lap.getId());
					System.out.println("Brand Name : "+lap.getBrand());
					System.out.println("Laptop Price : "+lap.getPrice());
					System.out.println("Laptop Color : "+lap.getColor());
					System.out.println("Processor Type : "+lap.getProcessor());
					System.out.println("Storage : "+lap.getStorage());
					System.out.println("Model No : "+lap.getModelNo());
					System.out.println("===================");
				}
			}
			
			public static void saveLaptop(Laptop lap) {
				EntityManager em = emf.createEntityManager();
				EntityTransaction et = em.getTransaction();
				
				et.begin();
				em.persist(lap);
				et.commit();
				System.out.println("Laptop Data Successfully Saved");
				
			}
			
			
			public static List<Laptop> fetchAllLaptop() {
				EntityManager em = emf.createEntityManager();
				
				String jpql = "select l from Laptop l ";
				Query query = em.createQuery(jpql);
				
				List<Laptop> list = query.getResultList();
				return list;
			}
}
