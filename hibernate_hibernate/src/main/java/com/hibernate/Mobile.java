package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

		private int id;
	@Column(name = "brand_name", nullable=false)
		private String brand;
	@Column(name = "mobile_price", nullable=false)
		private int Price;
	@Column(name = "ram", nullable=false)
		private String ram;
	@Column(name = "mobile_color", nullable=false)
		private String color;
		private String storage;
		@Column( nullable=false ,unique=true)
		private long imei;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public int getPrice() {
			return Price;
		}
		public void setPrice(int price) {
			Price = price;
		}
		public String getRam() {
			return ram;
		}
		public void setRam(String ram) {
			this.ram = ram;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getStorage() {
			return storage;
		}
		public void setStorage(String storage) {
			this.storage = storage;
		}
		public long getImei() {
			return imei;
		}
		public void setImei(long imei) {
			this.imei = imei;
		}
		
}
