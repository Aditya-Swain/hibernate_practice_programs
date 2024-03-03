package com.org.mapping;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchCarEngine {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select c from Car c";
		
		Query query = em.createQuery(jpql);
		
		List<Car>list = query.getResultList();
	
	    for(Car c : list) {
	    	System.out.println("Car Details : ");
	    	System.out.println("car id : "+c.getCid());
	    	System.out.println("car brand : "+c.getBrand());
	    	System.out.println("car color : "+c.getColor());
	    	
	    	System.out.println();
	    	
	    	System.out.println("Engine Details:");
	    	System.out.println("engine id : "+c.getE().geteId());
	    	System.out.println("engine name : "+c.getE().getEngineName());
	    	System.out.println("engine cc : "+c.getE().getCc());
	    	System.out.println("===============================");
	    	
	    }
	}
}
