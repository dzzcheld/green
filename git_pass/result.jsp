<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- input 으로 입력된 것을 표현언어로 사용하기 위해 초기화 선언
	 (다운로드할 파일 이름을 가져온다) -->
	<c:set var="file1" value="${param.param1 }"/>
	<c:set var="file2" value="${param.param2 }"/>
<title>Insert title here</title>
</head>
<body>
	
	매개변수 1:
	<!-- result에 명시된 file1 의 value 명시 -->
	<c:out value="${file1 }"/><br>
	<!-- file 1이 비어있지 않다면
		 contextPath 에 있는 이미지 file1 을 불러온다-->
	<c:if test="${ not empty file1}">
	<!-- 파일 이름으로 서블릿에서 이미지를 다운로드해 표시합니다 -->
		<img src="${contextPath }/download.do?fileName=${file1}" width=300 height=300/>
	</c:if>
	<br>
	
	매개변수 2:
	<c:out value="${file2 }"/><br>
	
	
	<c:if test="${ not empty file2}">
		<img src="${contextPath }/download.do?fileName=${file2}" width=300 height=300/>
	</c:if>
	<br>
	
	
	파일 내려받기:<br>
	<a href="${contextPath }/download.do?fileName=${file2}">
	파일 내려받기
	</a><br>
	
</body>
</html>