<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<form action="${contextPath}/login" method="post">
	<table>
		<tr>
			<td>아이디</td>
			<td>비밀번호</td>
		</tr>
		<tr>
			<td>
				<input type="text" id="id" name="id" placeholder="ID">
			</td>
			<td>
				<input type="text" id="pwd" name="pwd" placeholder="PWD">
			</td>
		</tr>
	</table>
	<input type="submit" value="로그인">
</form>
</body>
</html>