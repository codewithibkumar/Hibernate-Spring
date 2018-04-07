package com.techseries.spring;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LicInsurance insurance = new BikeInsurance();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");
		LicInsurance status = context.getBean("bikeInsurance",LicInsurance.class);
		System.out.println(status.showStatus());
		System.out.println(status);
		context.close();

	}

}
