package com.org.aadhar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Aadhar {
	@Id
		private String aadharNo;
		@OneToOne
		private Person person;
		
		
		public String getAadharNo() {
			return aadharNo;
		}
		public void setAadharNo(String aadharNo) {
			this.aadharNo = aadharNo;
		}
		public Person getPerson() {
			return person;
		}
		public void setPerson(Person person) {
			this.person = person;
		}
		
		
}
