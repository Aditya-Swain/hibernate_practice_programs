package com.org.LibraryBook;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddNewBook {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Library library = em.find(Library.class, 2);
		List<Books> list = library.getBook();
		
		Books book = new Books();
		book.setbId(1003);
		book.setbName("TheGhost");
		book.setWriterName("Nanami");
		book.setPrice(199);
		list.add(book);
		
		et.begin();
		em.persist(library);
		em.persist(book);
		et.commit();
		System.out.println("New Book Added ");
	}

}
