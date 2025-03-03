package com.pojoPackage;

public class Student {

	private int sid;
	private String sname;
	private String scity;
	
	
	public Student(int sid, String sname, String scity) {
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
	}

	
	public Student() {
		
	}

	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}

	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}
	
	
	
}
