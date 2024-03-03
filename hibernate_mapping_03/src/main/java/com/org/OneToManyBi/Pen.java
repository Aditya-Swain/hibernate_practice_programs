package com.org.OneToManyBi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Entity
public class Pen {
	@Id
			private int id;
			
			private String penName;
			
			private int penPrice;
			@ManyToOne
			private Box box;
}
