package com.example.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIResultTest {

	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("beanInfo.xml");
		
		MyObject myObject = ac.getBean("myObject",MyObject.class);
		
		myObject.printInfo();
		
		
	}
}
