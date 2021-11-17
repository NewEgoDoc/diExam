package com.example.di;

public class Speaker {
	int volumn;
	String company;
	int serialNum;
	Member memberObj;
	
	public Speaker(int volumn, String company, int serialNum, Member memberObj) {
		this.volumn = volumn;
		this.company = company;
		this.serialNum = serialNum;
		this.memberObj = memberObj;
	}

	@Override
	public String toString() {
		return "Speaker [volumn=" + volumn + ", company=" + company + ", serialNum=" + serialNum + ", memberObj="
				+ memberObj + "]";
	}
	
}
