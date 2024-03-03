package com.org.LibraryBook;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveLibraryBooks {
			public static void main(String[] args) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
				EntityManager em = emf.createEntityManager();
				EntityTransaction et = em.getTransaction();
				
				
				Library library = new Library();
				
				library.setlId(2);
				library.setName("StateLibrary");
				library.setAddress("Bhubaneswar");
				
				Books book1 = new Books();
				book1.setbId(1000);
				book1.setbName("DingaAndDingi");
				book1.setWriterName("KarthikSir");
				book1.setPrice(349);
				Books book2 = new Books();
				book2.setbId(1001);
				book2.setbName("RichDadPoorDad");
				book2.setWriterName("RobertKiyosaki");
				book2.setPrice(399);
				Books book3 = new Books();
				book3.setbId(1002);
				book3.setbName("GoldenRules");
				book3.setWriterName("NapoleonHill");
				book3.setPrice(299);
				
				List<Books> list = new ArrayList<Books>();
				list.add(book1);
				list.add(book2);
				list.add(book3);
				
				library.setBook(list);
				
				et.begin();
				em.persist(library);
				em.persist(book1);
				em.persist(book2);
				em.persist(book3);
				et.commit();
				System.out.println("Successfully saved");
				
				
				
			
			}
}
