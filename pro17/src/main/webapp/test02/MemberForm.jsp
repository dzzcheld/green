<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${contextPath}/member1/addMember.do" method="post">
		<table>

			<tr>
				<td>회원정보</td>
			</tr>

			<tr>
				<td width="200">
					<p align="right">아이디</p>
				</td>
				<td width="400">
					<p>
						<input type="text" name="id">
					</p>
				</td>
			</tr>

			<tr>
				<td width="200">
					<p align="right">비밀번호</p>
				</td>
				<td width="400">
					<p>
						<input type="password" name="pwd">
					</p>
				</td>
			</tr>

			<tr>
				<td width="200">
					<p align="right">이름</p>
				</td>
				<td width="400">
					<p>
						<input type="text" name="name">
					</p>
				</td>
			</tr>

			<tr>
				<td width="200">
					<p align="right">이메일</p>
				</td>
				<td width="400">
					<p>
						<input type="text" name="email">
					</p>
				</td>
			</tr>

			<tr>
				<td width="200">
					<p align="right">주소</p>
				</td>
				<td width="400">
					<p>
						<input type="text" name="address">
					</p>
				</td>
			</tr>

			<tr>
				<td width="200">
					<p>&nbsp;</p>
				</td>
				<td width="400"><input type="submit" value="가입하기"> <input
					type="reset" value="다시입력"></td>
			</tr>

		</table>
	</form>
</body>
</html>