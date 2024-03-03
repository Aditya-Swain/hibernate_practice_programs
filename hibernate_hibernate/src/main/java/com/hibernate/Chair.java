package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chair {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
		@Column(name = "brand_name", unique=true, nullable = false)
		private String brand;
		@Column(name = "chair_price" , nullable=false)
		private int price;
		@Column(nullable = false)
		private String color;
		private String code;
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
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
	
}
