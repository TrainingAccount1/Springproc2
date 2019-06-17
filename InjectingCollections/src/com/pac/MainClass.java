package com.pac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ClassCollection obj=(ClassCollection) context.getBean("text");
		
		
		obj.getAddresslist1();
		obj.getAddressset();
		obj.getAddressmap();
		obj.getAddressprop();
	
	}
	

}
