package com.org.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchById {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
		EntityManager em = emf.createEntityManager();
		
		Car c = em.find(Car.class, 1);
		
		if(c != null)
			{
			
			System.out.println("Car Details : ");
	    	System.out.println("car id : "+c.getCid());
	    	System.out.println("car brand : "+c.getBrand());
	    	System.out.println("car color : "+c.getColor());
	    	Engine e = c.getE();
	    	
	    	System.out.println();
	    	
	    	System.out.println("Engine Details:");
	    	System.out.println("engine id : "+e.geteId());
	    	System.out.println("engine name : "+e.getEngineName());
	    	System.out.println("engine cc : "+e.getCc());
	    	System.out.println("===============================");
	    	
			
		}
		else
			System.out.println("invalid id");
	}
}
