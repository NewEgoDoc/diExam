package com.example.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UseMemberBean {
	
	@Autowired//@Resource, @Inject
	MemberBean memberBean;
	
	//@Autowired : 타입 => 이름 => 한정자 	- from spring
	//@Inject : 타입 => 힌정자 => 이름 		- from Java
	//@Resource : 이름 => 타입 => 한정자		- from Java
	//@Qualifer: 한정자 
	
	public void useExam() {
		
	}
}
