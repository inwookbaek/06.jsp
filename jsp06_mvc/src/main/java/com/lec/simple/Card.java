package com.lec.simple;

public class Card {

	private int bno;
	private String subject;
	
	public Card(int bno, String subject) {
		this.bno = bno;
		this.subject = subject;
	}
	
	public int getBno() {
		return bno;
	}
	
	public String getSubject() {
		return subject;
	}
}
