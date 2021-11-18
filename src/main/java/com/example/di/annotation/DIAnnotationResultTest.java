package com.example.di.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIAnnotationResultTest {

	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("beanInfo.xml");
		
		UseMemberBean useMemberBean = ac.getBean("useMemberBean",UseMemberBean.class);
	}

}
