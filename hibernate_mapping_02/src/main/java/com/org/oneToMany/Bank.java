package com.org.oneToMany;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;

@Data
@Entity
public class Bank {
	@Id
		private int bId;
		private String bankName;
		private String branch;
		@OneToMany
		private List<Accounts> acc;
		
		
		
}
