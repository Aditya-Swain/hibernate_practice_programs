package com.org.OneToManyBi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Data
@Entity
public class Box {
	@Id
			private int id;
			
			private String name;
			
			private long price;
			
			@OneToMany
			private List<Pen> pen;
}
