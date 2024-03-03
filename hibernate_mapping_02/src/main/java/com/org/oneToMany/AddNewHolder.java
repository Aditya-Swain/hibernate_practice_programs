package com.org.oneToMany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddNewHolder {
			public static void main(String[] args) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
				EntityManager em = emf.createEntityManager();
				EntityTransaction et = em.getTransaction();
				
				Bank bank = em.find(Bank.class, 2);
				Accounts account = new Accounts();
				account.setAId(1115);
				account.setHolderName("Obito");
			 bank.getAcc().add(account);;
			
				
				
				et.begin();
				em.persist(bank);
				em.persist(account);
				et.commit();
				System.out.println("New Holder Added ");
				
			}
}
