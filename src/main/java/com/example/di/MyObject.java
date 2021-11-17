package com.example.di;

import java.util.Iterator;
import java.util.List;

public class MyObject {
	List<String> list;
	int[] intArr;

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