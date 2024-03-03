package com.org.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {
			@Id
	private int eId;
	private String engineName;
	private int cc;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getEngineName() {
		return engineName;
	}
	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
}
