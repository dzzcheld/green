<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 버튼 클릭스 result.jsp 로 연결 -->
	<form method="post" action="result.jsp">
		<input type=hidden name="param1" value="duke.JPG"/>
		<input type=hidden name="param2" value="duke2.JPG"/>
		<input type="submit" value="이미지 다운로드"/>
	</form>
</body>
</html>