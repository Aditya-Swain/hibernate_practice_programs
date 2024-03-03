package com.org.ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobileSim {
				public static void main(String[] args) {
					EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
					EntityManager em = emf.createEntityManager();
					EntityTransaction et = em.getTransaction();
					
					Mobile onePlus = new Mobile();
					onePlus.setId(2);
					onePlus.setBname("ONE_PLUS");
					onePlus.setRam("8GB");
					onePlus.setPrice(35000);
					
					Mobile iphone = new Mobile();
					iphone.setId(3);
					iphone.setBname("IPHONE");
					iphone.setRam("4GB");
					iphone.setPrice(110000);
					
					Sim jio = new Sim();
					jio.setId(111);
					jio.setProvider("JIO");
					jio.setNumber(8200654546l);
					
					Sim airtel = new Sim();
					airtel.setId(112);
					airtel.setProvider("AIRTEL");
					airtel.setNumber(9972774546l);
					
					Sim idea = new Sim();
					idea.setId(113);
					idea.setProvider("IDEA");
					idea.setNumber(8244651146l);
					
					jio.setMobile(onePlus);
					airtel.setMobile(onePlus);
					idea.setMobile(iphone);
					
					et.begin();
					em.persist(iphone);
					em.persist(onePlus);
					em.persist(jio);
					em.persist(airtel);
					em.persist(idea);
					et.commit();
					System.out.println("data added");
					
				}
}
