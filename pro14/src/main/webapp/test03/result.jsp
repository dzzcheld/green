<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	/* 3.userID 값이 있다면 환영합니다, 없다면 login.jsp로 돌아간다.  */
	String userID=request.getParameter("userID");
	if(userID.length()==0){
		/*
			RequestDispatcher dispatch=request.getRequestDispatcher("login.jsp");
		*/
%>
	<jsp:forward page="login.jsp"/>
<%
	}
%>
<h1>환영합니다 <%=userID %>님!!</h1>

<!-- 
1. login
	result.jsp로 웹으로 전달
	
2.	result(id 값을 받고 웹으로 출력)
	매개변수 userID가 들어와서 ID 값이 있다면 환영합니다 출력
	없다면 다시 login.jsp로 포워딩

3.	Memberform 
	회원가입 창 나옴
 -->
</body>
</html>