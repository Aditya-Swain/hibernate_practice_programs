package com.org.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Mobile {
	@Id
			private int id;
			
			private String bname;
			
			private String ram;
			
			private int price;
}
