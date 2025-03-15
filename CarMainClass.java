package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Car;

public class CarMainClass {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Car.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Car c = new Car();
		c.setCid(11245);
		c.setCbrand("Mahindra");
		c.setCmodel("Boloro");
		c.setCprice(1000000);
		c.setCyear(2019);
		
		ss.persist(c);
		tr.commit();
		
		System.out.println("Started...");

	}

}
