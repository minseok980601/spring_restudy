<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<c:forEach var="read" items="${list}" begin="0" end="1">
			<tr>
				<td>작성자 : ${read.id }</td>
			</tr>
			<tr>
				<td>제목 : </td>
				<td>
					${read.post_title }
				</td>
			</tr>
			<tr>
				<td>내용 : </td>
				<td>
					${read.post_content }
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>