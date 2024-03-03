package com.org.LibraryBook;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {
	@Id
		private int bId;
		private String bName;
		private String writerName;
		private int price;
		public int getbId() {
			return bId;
		}
		public void setbId(int bId) {
			this.bId = bId;
		}
		public String getbName() {
			return bName;
		}
		public void setbName(String bName) {
			this.bName = bName;
		}
		public String getWriterName() {
			return writerName;
		}
		public void setWriterName(String writerName) {
			this.writerName = writerName;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
}
