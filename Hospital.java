package com.pojoPackage;

public class Hospital {

	private int hid;
	private String hname;
	private String hlocation;
	private int hcapacity;
	private String hspecialties;
	private String hcontactNumber;
	
	
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getHlocation() {
		return hlocation;
	}
	public void setHlocation(String hlocation) {
		this.hlocation = hlocation;
	}
	public int getHcapacity() {
		return hcapacity;
	}
	public void setHcapacity(int hcapacity) {
		this.hcapacity = hcapacity;
	}
	public String getHspecialties() {
		return hspecialties;
	}
	public void setHspecialties(String hspecialties) {
		this.hspecialties = hspecialties;
	}
	public String getHcontactNumber() {
		return hcontactNumber;
	}
	public void setHcontactNumber(String hcontactNumber) {
		this.hcontactNumber = hcontactNumber;
	}
	
	
	@Override
	public String toString() {
		return "Hospital [hid=" + hid + ", hname=" + hname + ", hlocation=" + hlocation + ", hcapacity=" + hcapacity
				+ ", hspecialties=" + hspecialties + ", hcontactNumber=" + hcontactNumber + "]";
	}
	
	
	public Hospital(int hid, String hname, String hlocation, int hcapacity, String hspecialties,
			String hcontactNumber) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.hlocation = hlocation;
		this.hcapacity = hcapacity;
		this.hspecialties = hspecialties;
		this.hcontactNumber = hcontactNumber;
	}
	
	
	public Hospital() {
		
	}
	
	
}
