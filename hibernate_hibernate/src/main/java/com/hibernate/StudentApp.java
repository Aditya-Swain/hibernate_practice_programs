package com.hibernate;

import java.util.Scanner;

public class StudentApp {
			public static void main(String[] args) {
				Scanner os = new Scanner(System.in);
				StudentDao dao = new StudentDao();
				boolean flag = true;
				while(flag) {
				System.out.println("__________HOME PAGE___________");
				System.out.println("1.Insert");
				System.out.println("2.Fetch");
				System.out.println("3.Delete");
				System.out.println("4.Exit");
				int choice = os.nextInt();
				switch(choice) {
				
				case 1:{
					dao.insert();
					break;
				}
				case 2:{
					dao.Fetch();
					break;
				}
				case 3:{
					dao.Remove();
					break;
				}
					
				case 4:{
					System.out.println("Are you sure to exit ? \nPress 0 for Yes or press any number");
					if(os.nextInt()==0)
					flag=false;
					
					break;
				}
				default :
					System.out.println("Please enter valid choice");
				
				}
				}
				System.out.println("_______Thank You________");
			}
}
