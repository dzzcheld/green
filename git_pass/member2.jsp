<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*, sec01.ex01.MemberBean"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    	request.setCharacterEncoding("UTF-8");
    	
    %>
    <jsp:useBean id="membersList" class="java.util.ArrayList"/>
    <jsp:useBean id="membersMap" class="java.util.HashMap"/>
    <%
    membersMap.put("id", "아이디");
    membersMap.put("pwd", "비밀번호");
    membersMap.put("name", "이름");
    membersMap.put("email", "이메일");
    
    MemberBean m3=new MemberBean("son", "1234", "손흥민", "son@test.com");
    MemberBean m2=new MemberBean("ki", "4321", "기송용", "ki@test.com");
    MemberBean m1=new MemberBean("park2", "4321", "박지성", "park2@test.com");
    membersList.add(m1);
    membersList.add(m2);
    membersList.add(m3);
    membersMap.put("membersList", membersList);
    %>
    <c:set var="memberList" value="${membersMap.membersList}}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr align="center">
		<td>${membersMap.id}</td>
		<td>${membersMap.pwd}</td>
		<td>${membersMap.name}</td>
		<td>${membersMap.email}</td>
	</tr>
	
	<c:forEach var="i" begin="0" end="2">
	
	<tr align="center">
	<td>${membersList[i].id}</td>
	<td>${membersList[i].pwd}</td>
	<td>${membersList[i].name}</td>
	<td>${membersList[i].email}</td>
	</tr>
	</c:forEach>
	
	<%-- 	<tr align="center">
	<td>${membersList[1].id}</td>
	<td>${membersList[1].pwd}</td>
	<td>${membersList[1].name}</td>
	<td>${membersList[1].email}</td>
	</tr>
	
	<tr align="center">
	<td>${membersList[2].id}</td>
	<td>${membersList[2].pwd}</td>
	<td>${membersList[2].name}</td>
	<td>${membersList[2].email}</td>
	</tr> --%>
</table>
</body>
</html>