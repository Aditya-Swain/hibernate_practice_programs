package com.org.oneToMany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveAccount {
			public static void main(String[] args) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
				EntityManager em = emf.createEntityManager();
				EntityTransaction et = em.getTransaction();
				
				Bank bank = em.find(Bank.class, 1);
				
				List<Accounts> acc = bank.getAcc();
				
				
			}
}
