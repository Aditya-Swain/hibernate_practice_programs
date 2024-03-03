package com.org.controller;

import java.util.List;
import java.util.Scanner;

import com.org.dao.EmployeeDao;
import com.org.dto.Employee;

public class EmpController {
		public static void main(String[] args) {
			EmployeeDao dao = new EmployeeDao();
			Scanner os = new Scanner(System.in);
			boolean flag = true;
			do {
			System.out.println("-------HOME PAGE---------");
			System.out.println("1.Save Employee");
			System.out.println("2.Delete Employee By Id");
			System.out.println("3.Search Employee By Id");
			System.out.println("4.Fetch All Employee");
			System.out.println("5.Update Employee By Id");
			System.out.println("6.VerifyEmployee");
			System.out.println("7.Exit");
			System.out.println("CHOOSE YOUR CHOICE");
			
			int choice = os.nextInt();
			
			switch(choice) {
			case 1 :{
				//save employee
				System.out.println("Enter name : ");
				String name = os.next();
				System.out.println("Enter age");
				int age = os.nextInt();
				System.out.println("Enter email id : ");
				String email = os.next();
				System.out.println("Enter mobile : ");
				long mobile = os.nextLong();
				System.out.println("Enter password : ");
				String pwd = os.next();
				
				Employee emp = new Employee();
				emp.setName(name);
				emp.setAge(age);
				emp.setEmail(email);
				emp.setMobile(mobile);
				emp.setPassword(pwd);
				
				dao.saveEmployee(emp);
				System.out.println("Employee Data Saved Successfully");
				break;
				
			}
			case 2 : {
				//delete
				
				System.out.println("Enter Id : ");
				int id = os.nextInt();
				boolean b = dao.deleteEmployeeById(id);
				
				if(b)
					System.out.println("Employee Data Seleted Successfully");
				else
					System.err.println("Invalid Id !");
				break;
				
			}
			case 3 : {
				//search
				System.out.println("Enter Id : ");
				int id = os.nextInt();
				Employee emp = dao.SearchEmployeeById(id);
				System.out.println("Id : "+id);
				System.out.println("Name : "+emp.getName());
				System.out.println("Age : "+emp.getAge());
				System.out.println("Email Id : "+emp.getEmail());
				System.out.println("Mobile No : "+emp.getMobile());
				System.out.println("Password : "+emp.getPassword());
				break;
			}
			case 4 : {
				//fetch all
				List<Employee> list = dao.fetchAllEmployee();
				
				for(Employee e : list) {
					System.out.println("Id : "+e.getId());
					System.out.println("Name : "+e.getName());
					System.out.println("Age : "+e.getAge());
					System.out.println("Mobile : "+e.getMobile());
					System.out.println("Email Id : "+e.getEmail());
					System.out.println("Password : "+e.getPassword());
					System.out.println("========================");
				}
				
				
				break;
			}
			case 5 : {
				//update
				System.out.println("Enter Id : ");
				int id = os.nextInt();
				System.out.println("Enter new Name : ");
				String name = os.next();
				System.out.println("Enter new Age : ");
				int age = os.nextInt();
				System.out.println("Enter new Email : ");
				String email = os.next();
				System.out.println("Enter new Mobile : ");
				long mobile = os.nextLong();
				System.out.println("Enter new Password : ");
				String pwd = os.next();
				
				Employee emp = new Employee();
				emp.setName(name);
				emp.setAge(age);
				emp.setMobile(mobile);
				emp.setEmail(email);
				emp.setPassword(pwd);
				
				dao.updateEmployeeById(id, emp);
				System.out.println("Employee Data Updated Successfully");
				break;
			}
			case 6 : {
				//verify
				System.out.println("Enter Email Id : ");
				String email = os.next();
				System.out.println("Enter Password : ");
				String pwd = os.next();
				boolean b = dao.verifyEmployee(email, pwd);
				if(b) {
					System.out.println("Employee Successfully Verified ");
				}
					else
					System.out.println("Invalid Email Id and Password");
				break;
			}
			case 7 : {
				System.out.println("Are you sure to exit ?\nPress 0 to exit or press any number");
				int c = os.nextInt();
				if(c==0)
		           flag = false;
		              break;
			}
			default :
				System.out.println("Invalid choice !");
				break;
			}
			
		}while(flag);
			System.out.println("------THANK YOU--------");
		}
}
