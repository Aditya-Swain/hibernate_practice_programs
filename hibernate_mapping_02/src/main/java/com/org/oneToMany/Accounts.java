package com.org.oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Accounts {
			@Id
			private int aId;
			private  String holderName;
			
			
			
}
