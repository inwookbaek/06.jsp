package com.lec.simple;

public class Member {

	private int ssn;
	private String name;
	
	public Member(int ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	public int getSsn() {
		return ssn;
	}
	
	public String getName() {
		return name;
	}
}
