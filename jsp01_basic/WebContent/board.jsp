<%@page import="com.lec.board.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.lec.board.BoardList"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	BoardList bl = new BoardList();
	ArrayList<Board> boards = bl.getBoardList();
	
	String bd = "<table class='table table-dark' border='1'>";
	for(Board board:boards) {
		bd += "<tr><td>"
		   + board.getBno()     + "</td><td>"
		   + board.getSubject() + "</td><td>"
		   + board.getWriter()  + "</td><td>"
		   + board.getContent() + "</td></tr>";
	}
	bd += "</table>";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">	
	<title>Insert title here</title>
</head>
<body>
	<%= bd %>
</body>
</html>