package com.org.oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBankAccounts {
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			Bank bank = new Bank();
			bank.setBId(2);
			bank.setBankName("Axis");
			bank.setBranch("Baramunda");
			
			Accounts  account1 = new Accounts();
			account1.setAId(113);
			account1.setHolderName("Sagar");
			
			Accounts  account2 = new Accounts();
			account2.setAId(1111);
			account2.setHolderName("Manash");
			
			Accounts  account3 = new Accounts();
			account3.setAId(1112);
			account3.setHolderName("Karthik");
			
			Accounts  account4 = new Accounts();
			account4.setAId(1113);
			account4.setHolderName("Aditya");
			
			
			List<Accounts> list = new ArrayList<Accounts>();
			
			list.add(account1);
			list.add(account2);
			list.add(account3);
			list.add(account4);
			
			bank.setAcc(list);
			
			et.begin();
			em.persist(bank);
			em.persist(account1);
			em.persist(account2);
			em.persist(account3);
			em.persist(account4);
			et.commit();
			System.out.println("Successfully added");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
