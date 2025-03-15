package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.BusStand;

public class BusMainClass {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(BusStand.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		BusStand b = new BusStand();
		b.setSr(2);
		b.setFullName("Krishna Devidas Role");
		b.setEmailaddress("krishnarole34@gmail.com");
		b.setGender("Male");
		b.setAddress("Tambarwadi");
		b.setCity("Nilanga");
		b.setCountry("India");
		b.setDateofBirth("24/03/2001");
		b.setPassword("Krishna!12");
		b.setConfirm_password("Krishna!12");
		b.setPincode(413522);
		b.setUsername("krishnarole");
		
		ss.persist(b);
		tr.commit();
		System.out.println("Started....");

	}

}
