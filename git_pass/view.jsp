<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<!-- 
		code 값을 받아와서 select_item에 저장한다.
		
	 -->
	<%	
		String select_item=request.getParameter("code");
		String pageURL=null;
		
		if(select_item.equals("A")){
			pageURL="A.jsp";
		}
		else if(select_item.equals("B")){
			pageURL="2";
		}
		else if(select_item.equals("C")){
			pageURL="3";
		}
	%>
	<jsp:forward page="<%=pageURL %>"/>
	
</head>
<body>

</body>
</html>