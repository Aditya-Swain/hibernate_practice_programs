package com.org.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
@Data
@Entity

public class Students {
	@Id
		private int sid;
	
		private  String name;
		
		private int age;
		
		@ManyToMany
		private List<Courses> course; 
}
