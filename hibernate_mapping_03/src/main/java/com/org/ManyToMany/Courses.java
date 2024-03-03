package com.org.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
@Data
@Entity
public class Courses {
	@Id
		private int cid;
		
		private String courseName;
		
		@ManyToMany
		private List<Students> student;
}
