package com.org.LibraryBook;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Library {
	@Id
		private int lId;
		private String name;
		private String address;
		@OneToMany
		private List<Books> book;
		
		public int getlId() {
			return lId;
		}
		public void setlId(int lId) {
			this.lId = lId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public List<Books> getBook() {
			return book;
		}
		public void setBook(List<Books> book) {
			this.book = book;
		}
		
		
}
