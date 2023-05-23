package com.lec.simple;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/simple")
public class SimpleController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		processRequest(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		processRequest(req, res);
	}

	private void processRequest(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {	
		
		// localhost:8088/jsp06_mvc/simple?t=????
		String t = req.getParameter("t");
		String view_jsp = "";
		
		if(t.equals("i")) {
			// System.out.println("insert into ....");
			view_jsp = "insert.jsp";		
			
			Board board = new Board(1000, "김민재");
			req.setAttribute("board", board);	
			
		} else if(t.equals("s")) {
			// System.out.println("select * from .....");
			view_jsp = "select.jsp";
		} else if(t.equals("d")) {
			view_jsp = "delete.jsp";
			// System.out.println("delete from .....");
		} else if(t.equals("u")) {
			// System.out.println("update .....");
			view_jsp = "update.jsp";
		} else {
			view_jsp = "simple_view.jsp";
			req.setAttribute("result", "안녕하세요? 반갑습니다");
			req.setAttribute("now", new Date());
			req.setAttribute("user", "root");
			req.setAttribute("pass", "12345");
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(view_jsp);
		dispatcher.forward(req, res);
	}
}