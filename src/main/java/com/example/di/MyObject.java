package com.example.di;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class MyObject {
	
	private String aaa;
	private Member objMember;
	private Properties props;
	
	List<String> list;
	int[] intArr;

	
	
	
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

	public void setObjMember(Member objMember) {
		this.objMember = objMember;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public MyObject(String aaa, Member objMember) {
		super();
		this.aaa = aaa;
		this.objMember = objMember;
	}

	public void setIntArr(int[] intArr) {
		this.intArr = intArr;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	public void printInfo() {
		for (String element: list) {
			System.out.println(element);
		}
		System.out.println("================================");
		
		for (int element: intArr) {
			System.out.println(element);
		}
		System.out.println("================================");
	}
}