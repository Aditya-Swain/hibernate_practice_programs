package com.org.practice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Processor {
	@Id
		private int pid;
		private String pname;
		private int core;
		public int getId() {
			return pid;
		}
		public void setId(int id) {
			this.pid = id;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public int getCore() {
			return core;
		}
		public void setCore(int core) {
			this.core = core;
		}
		
		
}
