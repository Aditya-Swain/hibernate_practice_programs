package com.hibernate.practice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
		@Column(name = "brand_name", nullable=false )
	private String brand;
		@Column(name = "processor_type",nullable=false)
	private String processor;
		@Column(nullable = false)
	private int price;
		@Column(nullable= false)
	private String storage;
		@Column(name = "laptop_color" , nullable=false)
	private String color;
		@Column(nullable = false,unique=true)
	private String modelNo;
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
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	
	
	
}
