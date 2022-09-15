<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입 리스트</title>
</head>
<body>
	<table>
		<tr>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>이름</td>
			<td>이메일</td>
			<td>가입일자</td>
		</tr>
		<c:forEach var="member" items="${joinList}" begin="0" end="9">
			<tr>
				<td>
					${member.id}
				</td>
				<td>
					${member.pwd}
				</td>
				<td>
					${member.name}
				</td>
				<td>
					${member.email}
				</td>
				<td>
					${member.joinDate}
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="${contextPath}/login">로그인</a>
</body>
</html>