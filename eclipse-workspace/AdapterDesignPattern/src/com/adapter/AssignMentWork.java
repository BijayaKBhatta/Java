package com.adapter;

public class AssignMentWork {
	private Pen p;
	public Pen getP() {
		return p;
	}
	public void setP(Pen p) {
		this.p = p;
	}
	public void writeAssignMent(String str) {
		p.write(str);
	}

}
