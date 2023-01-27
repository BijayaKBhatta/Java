package com.spring.jpa.entity;

public class Destination {

	
	private String dest;

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public Destination(String dest) {
		super();
		this.dest = dest;
	}

	public Destination() {
		super();
	}
}
