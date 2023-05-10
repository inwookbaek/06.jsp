<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 실습. 1~10까지의 합을 구하기 -->
	<h4>1~10까지의 합은 <%= 1+2+3+4+5+6+7+8+9+10 %>입니다</h4>
	<%
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum += i;
		}
	%>
	<h4>1~10까지의 합은 <%= sum %>입니다</h4>
</body>
</html>