<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>
	<table>
		<tr>
			<td>아이디 : ${loginMember.id }</td>
			<td>이름 : ${loginMember.name }</td>
		</tr>
	</table>
	<a href="${contextPath }/writing?id=${loginMember.id}">글 쓰기</a>
</body>
</html>