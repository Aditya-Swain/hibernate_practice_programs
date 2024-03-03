package com.org.oneToMany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class fetchBankAccounts {
		public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
			EntityManager em = emf.createEntityManager();
			
			String jpql = "select b from Bank b";
			Query query = em.createQuery(jpql);
			List<Bank> list = query.getResultList();
			
			for(Bank b : list) {
				List<Accounts> accounts = b.getAcc();
				System.out.println("BId : "+b.getBId());
				System.out.println("BankName : "+b.getBankName());
				System.out.println("BranchName : "+b.getBranch());
				
				for(Accounts acc : accounts)
					System.out.print(acc.getHolderName()+",");
				
				System.out.println();
				System.out.println("==================");
			}
		}
}
