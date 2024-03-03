package com.org.practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
		private int lid;
		private String lname;
		private long price;
		private String storage;
		@OneToOne
		private Processor p;
		public int getId() {
			return lid;
		}
		public void setId(int id) {
			this.lid = id;
		}
		public String getName() {
			return lname;
		}
		public void setName(String name) {
			this.lname = name;
		}
		public long getPrice() {
			return price;
		}
		public void setPrice(long price) {
			this.price = price;
		}
		public String getStorage() {
			return storage;
		}
		public void setStorage(String storage) {
			this.storage = storage;
		}
		public Processor getP() {
			return p;
		}
		public void setP(Processor p) {
			this.p = p;
		}
		
		
}
