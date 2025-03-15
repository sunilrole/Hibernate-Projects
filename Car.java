package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {

	@Id
	private int cid;
	private String cbrand;
	private String cmodel;
	private int cyear;
	private long cprice;

	public Car() {

	}

	public Car(int cid, String cbrand, String cmodel, int cyear, long cprice) {
		super();
		this.cid = cid;
		this.cbrand = cbrand;
		this.cmodel = cmodel;
		this.cyear = cyear;
		this.cprice = cprice;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cbrand=" + cbrand + ", cmodel=" + cmodel + ", cyear=" + cyear + ", cprice="
				+ cprice + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCbrand() {
		return cbrand;
	}

	public void setCbrand(String cbrand) {
		this.cbrand = cbrand;
	}

	public String getCmodel() {
		return cmodel;
	}

	public void setCmodel(String cmodel) {
		this.cmodel = cmodel;
	}

	public int getCyear() {
		return cyear;
	}

	public void setCyear(int cyear) {
		this.cyear = cyear;
	}

	public long getCprice() {
		return cprice;
	}

	public void setCprice(long cprice) {
		this.cprice = cprice;
	}

}
