package com.org.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudentCourse {
			public static void main(String[] args) {
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("aditya");
				EntityManager em = emf.createEntityManager();
				EntityTransaction et = em.getTransaction();
				
				Students aditya = new Students();
				aditya.setSid(100);
				aditya.setName("aditya");
				aditya.setAge(20);
				
				Students akash = new Students();
				akash.setSid(101);
				akash.setName("akash");
				akash.setAge(18);
				
				Students prabhat = new Students();
				prabhat.setSid(102);
				prabhat.setName("prabhat");
				prabhat.setAge(15);
				
				Courses html = new Courses();
				html.setCid(1);
				html.setCourseName("HTML");
				
				Courses python = new Courses();
				python.setCid(2);
				python.setCourseName("PYTHON");
				
				Courses javascript = new Courses();
				javascript.setCid(3);
				javascript.setCourseName("JAVASCRIPT");
				
				Courses java = new Courses();
				java.setCid(4);
				java.setCourseName("JAVA");
				
				List<Courses> course1 = new ArrayList<Courses>();
				
				course1.add(html);
				course1.add(python);
				course1.add(java);
				List<Courses> course2 = new ArrayList<Courses>();
				
				course2.add(javascript);
				course2.add(python);
				course2.add(java);
				List<Courses> course3 = new ArrayList<Courses>();
				
				course3.add(html);
				course3.add(python);
				course3.add(javascript);
				
				aditya.setCourse(course1);
				akash.setCourse(course2);
				prabhat.setCourse(course3);
				
				List<Students> student1 = new ArrayList<Students>();
				
				student1.add(aditya);
				student1.add(akash);
				List<Students> student2 = new ArrayList<Students>();
				
				student2.add(akash);
				student2.add(prabhat);
				List<Students> student3 = new ArrayList<Students>();
				
				student3.add(aditya);
				student3.add(prabhat);
				
				
				html.setStudent(student1);
				python.setStudent(student2);
				javascript.setStudent(student3);
				java.setStudent(student2);
				
				et.begin();
				em.persist(aditya);
				em.persist(akash);
				em.persist(prabhat);
				em.persist(html);
				em.persist(python);
				em.persist(javascript);
				em.persist(java);
				et.commit();
				System.out.println("data added");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
}
