package com.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MobileController {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");

			public static void main(String[] args) {
				
		//saving mobile details		
				Mobile mob = new Mobile();
			mob.setBrand("NOKIA");
			mob.setPrice(16000);
			mob.setColor("purple");
			mob.setRam("3GB");
			mob.setStorage("8GB");
			mob.setImei(786771444);
			saveMobile(mob);
			
	//fetching mobile by brand name		
			String bname="NOKIA";
			List<Mobile> list = fetchAllMobile(bname);
			for(Mobile m : list) {
				System.out.println(m.getBrand());
				System.out.println(m.getColor());
				System.out.println(m.getRam());
				System.out.println(m.getStorage());
				System.out.println(m.getImei());
				System.out.println(m.getPrice());
				System.out.println("-==================-");
			}
			}
			
			
			public static void saveMobile(Mobile mob) {
				EntityManager em = emf.createEntityManager();
				EntityTransaction et = em.getTransaction();
				
				
				et.begin();
				em.persist(mob);
				et.commit();
				System.out.println(" Mobile Data stored successfully");
			}
			
			public static List<Mobile> fetchAllMobile(String bname) {
				EntityManager em = emf.createEntityManager();
								
				String jpql = "select m from Mobile m where m.brand=?1";
				
				Query query = em.createQuery(jpql);
				query.setParameter(1, bname);
				List<Mobile> list = query.getResultList();
				return list;
			}
}
