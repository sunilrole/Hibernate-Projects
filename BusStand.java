package com.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BusStand {

	@Id
	private int sr;
	private String fullName;
	private String emailaddress;
	private String city;
	private String dateofBirth;
	private String gender;
	private String address;
	private String country;
	private int pincode;
	private String password;
	private String confirm_password;
	private String username;

	public BusStand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusStand(int sr, String fullName, String emailaddress, String city, String dateofBirth, String gender,
			String address, String country, int pincode, String password, String confirm_password, String username) {
		super();
		this.sr = sr;
		this.fullName = fullName;
		this.emailaddress = emailaddress;
		this.city = city;
		this.dateofBirth = dateofBirth;
		this.gender = gender;
		this.address = address;
		this.country = country;
		this.pincode = pincode;
		this.password = password;
		this.confirm_password = confirm_password;
		this.username = username;
	}

	@Override
	public String toString() {
		return "BusStand [sr=" + sr + ", fullName=" + fullName + ", emailaddress=" + emailaddress + ", city=" + city
				+ ", dateofBirth=" + dateofBirth + ", gender=" + gender + ", address=" + address + ", country="
				+ country + ", pincode=" + pincode + ", password=" + password + ", confirm_password=" + confirm_password
				+ ", username=" + username + "]";
	}

	public int getSr() {
		return sr;
	}

	public void setSr(int sr) {
		this.sr = sr;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
