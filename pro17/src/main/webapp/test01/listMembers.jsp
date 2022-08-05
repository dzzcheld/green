<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*, sec01.ex01.* "
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.cls1{
		font-size:40px;
		text-align:center;
	}
</style>
</head>
<body>
	<table class=cls1 align ="center" border=1>
   <tr align="center" bgcolor="lightgreen">
      <td width="7%"><b>아이디</b></td>
      <td width="7%"><b>비밀번호</b></td>
      <td width="7%"><b>이름</b></td>
      <td width="7%"><b>이메일</b></td>
      <td width="7%"><b>주소</b></td>
   </tr>
	
	<c:choose>
	
		<c:when test="${membersList==null }">
			<tr>
				<td colspan=5>
				</td>
			</tr>
		</c:when>
	
		<c:when test="${membersList !=null }">
			<c:forEach var="mem" items="${membersList}">
				<tr align="center">
					<td>${mem.id }</td>
					<td>${mem.pwd }</td>
					<td>${mem.name }</td>
					<td>${mem.email }</td>
					<td>${mem.joinDate }</td>
			</tr>
			</c:forEach>
		</c:when>
	</c:choose>
	</table>
	<p class="cls2">회원 가입하기</p>
</body>
</html> --%>