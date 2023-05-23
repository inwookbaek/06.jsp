package com.lec.simple;

public class Board {

	private int bno;
	private String subject;
	
	public Board(int bno, String subject) {
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
