<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%	
	request.setCharacterEncoding("utf-8");
	int dan=Integer.parseInt(request.getParameter("dan"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border='1' width='800'>
		
		<%
			for(int i=dan-2; i<=dan ; i++){
		%>
		<tr align='center' bgcolor='#FFFF66'>
			<td colspan='2'><%= i %>단 출력</td>
		<tr>
		<%		
			for(int k=1; k<=9; k++){	 
		%>
		<%
			if(k%2==1){
		%>
			<tr align=center bgcolor="#CCFF66">
		<%
			}else{
		%>
			<tr align=center bgcolor="#CCCCFF">
		<%
			}
		%>	
			<td width='400'>
				<%=i %>*<%=k %>
			</td>
			<td width='400'>
				<%=i*k %>
			</td>
		<%
			}
		%>
		<%
			
			}
		%>
	</table>
</body>
</html>