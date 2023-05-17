package com.lec.dbcp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class DBCPInit extends HttpServlet {

	@Override
	public void init() throws ServletException {
		loadJDBCDriver();
		initConnectionPool();
	}
	
	private void loadJDBCDriver() {
		// Class.forName("org.mariadb....."); 대신에
		// web.xml에 정의하고 로딩
		String driverClass = getInitParameter("jdbcDriver");
		
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("JDBC드라이버로딩실패!! = " +
				"web.xml 초기화 파라미터 jdbcDriver를 확인하세요!!");
		}
		
	}

	private void initConnectionPool() {
		
		String url = getInitParameter("url");
		String usr = getInitParameter("user");
		String pwd = getInitParameter("pass");
		
		// CP을 정의하기 위해서 Library를 등록
		// commons-dbcp-?,?.jar, commons-pool2-?.?.jar, 
		// commons-logging-?,?.jar
		
		// A. Connection Factory생성
		// 1. 
		// 2.
		// 3.
		
		// B. Connection Pool설정정보
		// 1.
		// 2.
		// 3.
		// 4.
		// 5.
		
		// C. Connection Pool설정정보를 이용헤서 CP을 생성
		// 1.
		// 2.
		
		// D. Connection Pool에 제공할 JDBC드라이버를 등록
	}
}













