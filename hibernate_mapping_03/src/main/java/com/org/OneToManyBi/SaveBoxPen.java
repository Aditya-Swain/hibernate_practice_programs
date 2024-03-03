package com.org.OneToManyBi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBoxPen {
				public static void main(String[] args) {
					EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
					EntityManager em = emf.createEntityManager();
					EntityTransaction et = em.getTransaction();
					
					Box classmate = new Box();
					classmate.setId(2);
					classmate.setName("CLASSMATE");
					classmate.setPrice(220);
					
					
					Pen pen1 = new Pen();
					pen1.setId(114);
					pen1.setPenName("UNOMAX");
					pen1.setPenPrice(10);
					
					Pen pen2 = new Pen();
					pen2.setId(115);
					pen2.setPenName("HAUSER");
					pen2.setPenPrice(20);
					
					Pen pen3 = new Pen();
					pen3.setId(116);
					pen3.setPenName("LUXOR");
					pen3.setPenPrice(9);
					
					List<Pen> list1 = new ArrayList<Pen>();					
					
					list1.add(pen1);
					list1.add(pen2);
					list1.add(pen3);
					
					
					classmate.setPen(list1);
					
					pen1.setBox(classmate);
					pen2.setBox(classmate);
					pen3.setBox(classmate);
					
					et.begin();
					em.persist(classmate);
					em.persist(pen1);
					em.persist(pen2);
					em.persist(pen3);
					et.commit();
					System.out.println("Data added");
					
					
				}
}
