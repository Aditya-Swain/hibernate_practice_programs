package com.org.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Entity
public class Sim {
	@Id
		private int id;
		
		private String provider;
		
		private long number;
		@ManyToOne
		private Mobile mobile;
}
