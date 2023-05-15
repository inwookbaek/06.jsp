<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	Map<String, String> member = new HashMap<>();
	member.put("id", "hong");
	member.put("pw", "12345");
	member.put("name", "홍길동");
	member.put("addr", "조선 한양 진고개 언덕너머!!!");
%>
<%!  %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">	
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<title>Insert title here</title>
</head>
<body>
	회원아이디 : <%= member.get("id") %> -- 메모리영역 : page<br>
	회원아이디 : ${ member.get("id") } -- 메모리영역 : pageScope<br>
	<c:set var="member" value="<%= member %>"></c:set>
	회원아이디 : ${ member.get("id") } <br>
	<hr />
	
	<!-- c:forEach : var, items, begin, end, step, varStatus -->
	<div class="container" align="center">
		<h1>forEach</h1>
		<c:set var="data" value="<%= member %>"/>
		
		<h3>1. Collection(HashMap)계열 반복처리</h3>
		<c:forEach var="m" items="${ data }">
			${m.key} = ${m.value}<br>
		</c:forEach>
		<hr />
		
		<h3>2. Array 반복처리</h3>
		<c:set var="arr" value="<%= new int[] {1,2,3,4,5,6,7,8,9,10} %>"/>
		<c:forEach var="i" items="${arr}">
			${ i },
		</c:forEach>
		<hr />
		
		<h3>core tag를 이용한 반복처리</h3>
		<c:forEach var="i" begin="1" end="10" step="2" varStatus="status">
			${status.index} : ${status.count} = [ ${i} ]<br>
		</c:forEach>
		<hr />
		
		<h3>실습1. 1~100까지 홀수합? (begin, end, step)</h3>
		<c:forEach var="i" begin="1" end="100" step="2">
			<c:set var="sum" value="${sum+i}"/> <!-- sum +=i -->
		</c:forEach>
		<h4>1~100까지 홀수의 합 = ${ sum }</h4>
		<hr />
		
		<h3>실습2. 구구단(9단)출력하기</h3>
		<c:forEach var="i" begin="2" end="9">
			<li>9 x ${ i } = ${ 9 * i }</li>
		</c:forEach>
	</div>
</body>
</html>

















