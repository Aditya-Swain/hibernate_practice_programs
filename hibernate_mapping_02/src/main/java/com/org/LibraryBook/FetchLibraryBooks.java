package com.org.LibraryBook;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchLibraryBooks {
			public static void main(String[] args) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
				EntityManager em = emf.createEntityManager();
				
				String jpql = "select l from Library l";
				Query query = em.createQuery(jpql);
				List<Library> list = query.getResultList();
				
				for(Library l : list) {
					List<Books> book = l.getBook();
					System.out.println("LIBRARY DETAILS : ");
					System.out.println("Library Id : "+l.getlId());
					System.out.println("Name : "+l.getName());
					System.out.println("Address : "+l.getAddress());
					System.out.println("BOOK DETAILS : ");
					for(Books b : book) {
						System.out.println("Book Id : "+b.getbId());
						System.out.println("Name : "+b.getbName());
						System.out.println("Author Name : "+b.getWriterName());
						System.out.println("Price : "+b.getPrice());
						System.out.println("--------------------------------");

					}
					System.out.println("*****************************************");
				}
			}
}
